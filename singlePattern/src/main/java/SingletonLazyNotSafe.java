public class SingletonLazyNotSafe {
    private static SingletonLazyNotSafe instance;
    private SingletonLazyNotSafe(){

    }
    public static SingletonLazyNotSafe getInstance(){
        if(instance==null){
            instance=new SingletonLazyNotSafe();
        }
        return instance;
    }
}
