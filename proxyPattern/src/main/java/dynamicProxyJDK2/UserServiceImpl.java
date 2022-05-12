package dynamicProxyJDK2;

public class UserServiceImpl implements UserService {
    public void add() {
        System.out.println("调用add方法");
    }

    public void delete() {
        System.out.println("调用delete方法");
    }

    public void update() {
        System.out.println("调用update方法");
    }

    public void query() {
        System.out.println("调用query方法");
    }

}
