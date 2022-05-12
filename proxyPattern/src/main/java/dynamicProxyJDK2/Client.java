package dynamicProxyJDK2;

/**
 * 动态代理的体现：
 *
 * 通过Proxy的静态方法Proxy.newProxyInstance()来动态生成代理对象，而不是直接写好的。
 * 对于方法调用，代理对象调用接口中的方法时，是将方法分派到调用处理程序的invoke()方法。
 */
public class Client {
    public static void main(String[] args) {
        // 真实对象
        UserService userService = new UserServiceImpl();
        // 代理对象的调用处理程序
        UserServiceHandler handler = new UserServiceHandler();
        handler.setTarget(userService);// 设置要代理的对象
        // 动态生成了代理类
        UserService proxy =  (UserService) handler.getProxy();
        // 代理类去调用方法
        proxy.add();
    }
}
