package proxy.staticproxy;

import proxy.ITeacher;

//实现类
public class TeacherImpl implements ITeacher {
    @Override
    public void teacher() {
        System.out.println("开始上课!");
    }
}