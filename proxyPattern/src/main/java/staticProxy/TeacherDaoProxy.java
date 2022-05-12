package staticProxy;

public class TeacherDaoProxy    implements ITeacherDao {
    private ITeacherDao target; //通过接口聚合目标对象
    public TeacherDaoProxy(ITeacherDao target) {
        this.target = target;
    }
    @Override
    public void teach() {
        System.out.println("静态代理开始");
        target.teach();
        System.out.println("静态代理结束");
    }
}
