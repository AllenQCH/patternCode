package staticPattern2;
//房东
public class Landlord implements Rent {
    @Override
    public void rent() {
        System.out.println("出租房子");
    }
}
