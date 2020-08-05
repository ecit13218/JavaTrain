package proxy.jdkproxy;

import proxy.ITeacher;

//实现类
public class TeacherImpl implements ITeacher {
    @Override
    public void teacher() {
        System.out.println("动态代理开始上课!");
    }
}