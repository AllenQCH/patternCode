package staticPattern2;
//中介
public class Proxy implements Rent {
    //这一步与另一个例子不一样，因为他那边是直接声明了一个接口，然后传值的时候传递对象
    private Landlord landlord;
    //这一步与另一个例子不一样，因为他那边是直接声明了一个接口，然后传值的时候传递对象
    public Proxy(Landlord landlord) {
        this.landlord = landlord;
    }

    // 代理类实现相关接口，所以和真实对象有相同的行为
    public void rent() {
        //这一步是一样的，都是使用的上面landlord形参的方法
        landlord.rent();
    }

    /*
    代理类可以有一些自己的业务
     */
    public void seeHouse() {
        System.out.println("看房子");
    }

    public void sign() {
        System.out.println("签合同");
    }

}
