package proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

//中介类
public class DynamicProxyInvocationHandler implements InvocationHandler {
    
    private Object target;
    public DynamicProxyInvocationHandler(Object object){
        target = object;
    }
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("上课前");
        Object result = method.invoke(target, args);
        System.out.println("上课后");
        return result;
    }
}