package proxy.cglibproxy;

//客户端类
public class Client {
    public static void main(String[] args) {
        TeacherDAO teacherDAO = new TeacherDAO();
        DynamicCglibProxy dynamicCglibProxy = new DynamicCglibProxy(teacherDAO);
        TeacherDAO teacherProxy = (TeacherDAO) dynamicCglibProxy.getProxy();
        teacherProxy.teacher();
    }
}