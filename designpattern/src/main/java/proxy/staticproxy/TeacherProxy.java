package proxy.staticproxy;

import proxy.ITeacher;

//代理类
public class TeacherProxy implements ITeacher {
    private ITeacher target;

    public TeacherProxy(ITeacher object) {
        this.target = object;
    }

    @Override
    public void teacher() {
        //增强对应方法
        System.out.println("上课前!");
        target.teacher();
        System.out.println("上课后!");
    }
}