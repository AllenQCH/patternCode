package staticPattern2;
//客户
public class Client {
    public static void main(String[] args) {
        Landlord landlord = new Landlord();// 房东
        Proxy proxy = new Proxy(landlord);// 房屋中介
        proxy.rent();// 租户向中介租房子
        proxy.seeHouse();// 租户和中介看房子
        proxy.sign();// 租户和中介签合同
    }
}
