package proxy.cglibproxy;

//被代理对象
public class TeacherDAO {
    public void teacher(){
        System.out.println("cglib上课!");
    }
}