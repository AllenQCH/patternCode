package dynamicProxyJDK2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class UserServiceHandler implements InvocationHandler {
    // 被代理的对象，即真实对象，类型为Object，具有通用性
    private Object target;

    public void setTarget(Object target) {
        this.target = target;
    }

    // 通过Proxy的静态方法来生成代理类
    public Object getProxy() {
        return Proxy.newProxyInstance(
                this.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                this);
    }

    // 调用处理程序，并返回结果
    public Object invoke(Object proxy, Method method,
                         Object[] args) throws Throwable {
        log(method.getName());// 增加日志的功能
        // 在真实的对象执行之前我们可以添加自己的操作，比如上面的日志功能
        System.out.println("before invoke...");
        Object invoke = method.invoke(target, args);
        // 在真实的对象执行之后我们可以添加自己的操作
        System.out.println("after invoke...");
        return invoke;
    }

    // 如果想增加日志功能，直接在代理类中的各个方法中调用日志方法
    // 日志方法
    private void log(String msg) {
        System.out.println("[Debug]调用了"+msg+"方法");
    }

}
