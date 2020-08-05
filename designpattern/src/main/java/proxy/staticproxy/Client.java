package proxy.staticproxy;

import proxy.ITeacher;

//客户端类
public class Client {
    public static void main(String[] args) {
        ITeacher teacher = new TeacherImpl();
        TeacherProxy teacherProxy = new TeacherProxy(teacher);
        teacherProxy.teacher();
    }
}