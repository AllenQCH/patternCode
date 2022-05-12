public class SingletonHungryNotSafe {

    private static SingletonHungryNotSafe instance = new SingletonHungryNotSafe();

    private SingletonHungryNotSafe() {

    }

    public static SingletonHungryNotSafe getInstance() {
        return instance;
    }
}
