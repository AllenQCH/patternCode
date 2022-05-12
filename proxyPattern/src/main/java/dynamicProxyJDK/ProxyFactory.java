package dynamicProxyJDK;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyFactory {
    //维护一个目标对象 , Object
    private Object target;
    //构造器 ， 对target 进行初始化
    public ProxyFactory(Object target) {
        this.target = target;
    }
    //动态生成一个代理对象;即 使用JDK包java.lang.reflect.Proxy中的newProxyInstance方法来动态的创建目标对象（被代理对象）
    public Object getProxyInstance() {
        /**
         * Proxy类就是用来创建一个代理对象的类，它提供了很多方法，但是我们最常用的是newProxyInstance方法。
         * loader：一个Classloader对象，定义了由哪个Classloader对象对生成的代理类进行加载；
         * interfaces：一个interface对象数组，表示我们将要给我们的代理对象提供一组什么样的接口，如果我们提供了这样一个接口对象数组，那么也就是声明了代理类实现了这些接口，代理类就可以调用接口中声明的所有方法。
         *  var2：一个InvocationHandler对象，表示的是当动态代理对象调用方法的时候会关联到哪一个InvocationHandler对象上，并最终由其调用。
         */
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() { //匿名类重写invoke方法
                    @Override
                    /**
                     * proxy:代理对象
                     * method:代理对象调用接口方法所对应的Method实例。
                     * 注：我们是通过代理对象来调用真实对象中的方法。
                     * args:指代理对象调用方法传递的参数
                     */
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("动态代理开始");
                        Object returnVal = method.invoke(target, args);//反射机制调用目标对象的方法
                        System.out.println("动态代理结束");
                        return returnVal;
                    }
                });
    }
}
