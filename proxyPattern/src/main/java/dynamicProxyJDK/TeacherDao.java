package dynamicProxyJDK;

public class TeacherDao implements ITeacherDao {
    @Override
    public void teach() {
        System.out.println("一键三连");
    }
    @Override
    public void tesst(String name) {
        System.out.println("传参测试：" + name);
    }

}
