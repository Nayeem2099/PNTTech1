package singleton;

public class UseSingleton {
    public static void main(String[] args) {

        Singleton singleton = Singleton.getInstance();
        singleton.doWork();


    }
}
