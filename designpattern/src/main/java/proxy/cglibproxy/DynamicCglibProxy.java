package proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

//代理创建器
public class DynamicCglibProxy implements MethodInterceptor {
    
    private Enhancer enhancer = new Enhancer();
    private Object target;

    public DynamicCglibProxy(Object obj) {
        target = obj;
    }
    public Object getProxy(){
        //设置需要代理的父类
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        //动态创建子类实例
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("上课前!");
        Object result = method.invoke(target, objects);
        System.out.println("上课后！");
        return result;
    }
}