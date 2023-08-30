package multithreading;

public class Main extends Thread {

    public static void main(String[] args) {

        Main thread = new Main();
        thread.start(); //this automatically executes the method you call "run".. Must be "run".
        System.out.println("This code is outside of the thread");
    }
    public void run(){
        System.out.println("This code is running in a thread");

    }
}

//both threads ran simultaneously together.