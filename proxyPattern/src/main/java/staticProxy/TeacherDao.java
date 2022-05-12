package staticProxy;

public class TeacherDao implements ITeacherDao  {
    @Override
    public void teach() {
        System.out.println("一键三连");
    }
}
