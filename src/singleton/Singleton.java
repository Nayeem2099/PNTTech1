package singleton;

public class Singleton {

    private Singleton(){

    }
    static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }

    public void doWork(){
        System.out.println("do the task");
        }
}
