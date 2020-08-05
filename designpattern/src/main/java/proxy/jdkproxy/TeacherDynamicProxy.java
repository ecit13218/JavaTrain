package proxy.jdkproxy;

import java.lang.reflect.Proxy;

//代理类
public class TeacherDynamicProxy {
    private Object target;

    public TeacherDynamicProxy(Object target) {
        this.target = target;
    }
    
    public Object getProxyInstance(){
        //调用JDK的API
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),
                new DynamicProxyInvocationHandler(target));
  
    }
}