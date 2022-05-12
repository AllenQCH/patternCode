package dynamicProxyJDK;

public class Client {
    public static void main(String[] args) {
        //创建目标对象
        ITeacherDao target = new TeacherDao();

        //创建代理对象
        ITeacherDao proxyInstance = (ITeacherDao)new ProxyFactory(target).getProxyInstance();

        //内存中动态生成了代理对象
        System.out.println(proxyInstance.getClass());

        //通过代理对象，调用目标对象的方法
        proxyInstance.teach();
        proxyInstance.tesst("一键三连");
    }

}
/*运行结果：
动态代理开始
一键三连
动态代理结束
动态代理开始
传参测试：一键三连
动态代理结束
*/