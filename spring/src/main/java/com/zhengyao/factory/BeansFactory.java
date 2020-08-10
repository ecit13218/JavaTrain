package com.zhengyao.factory;

import org.dom4j.Document;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeansFactory {

    private static Map<String, Object> classMap = new HashMap<>();

    static {
        InputStream resourceAsStream = BeansFactory.class.getClassLoader().getResourceAsStream("config.xml");
        SAXReader saxReader = new SAXReader();
        try {
            //使用dom4j解析XML配置文件
            Document read = saxReader.read(resourceAsStream);
            Element rootElement = read.getRootElement();
            List<Element> list = rootElement.selectNodes("//bean");
            //先将所有的bean 给解析完成
            for (Element element : list) {
                String id = element.attributeValue("id");
                String className = element.attributeValue("class");
                Class<?> clazz = Class.forName(className);
                Object obj = clazz.newInstance();
                classMap.put(id,obj);
            }
            //解析所有的property,这里只配置了ref类型
            List<Element> propertyList = rootElement.selectNodes("//property");
            for (Element element : propertyList) {
                Element parent = element.getParent();
                String parentId = parent.attributeValue("id");
                String elementId = element.attributeValue("id");
                String ref = element.attributeValue("ref");
                Object object = classMap.get(parentId);
                Object refObj = classMap.get(ref);
                Method[] declaredMethods = object.getClass().getDeclaredMethods();
                for (Method declaredMethod : declaredMethods) {
                    //使用set 方法注入
                    if (declaredMethod.getName().equals("set" + elementId)) {
                        declaredMethod.invoke(object,refObj);
                        break;
                    }
                }
                classMap.put(parentId, object);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    public static Object getClass(String id){
        return classMap.get(id);
    }
}