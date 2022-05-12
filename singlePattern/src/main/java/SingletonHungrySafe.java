public class SingletonHungrySafe {

    private static class SingletonHolder {
        private static SingletonHungrySafe instance = new SingletonHungrySafe();
    }

    private SingletonHungrySafe() {
        System.out.println("Singleton has loaded");
    }

    public static SingletonHungrySafe getInstance() {
        return SingletonHolder.instance;
    }
}
