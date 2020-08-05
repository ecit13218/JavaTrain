package proxy.jdkproxy;

import proxy.ITeacher;

//客户端类
public class Client {
    public static void main(String[] args) {
        ITeacher teacher = new TeacherImpl();
        TeacherDynamicProxy dynamicProxy = new TeacherDynamicProxy(teacher);
        ITeacher teacherProxy = (ITeacher) dynamicProxy.getProxyInstance();
        teacherProxy.teacher();
    } 
}