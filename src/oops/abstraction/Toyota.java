package oops.abstraction;

public class Toyota extends ModernCar implements Car, Motor{

    @Override
    public void shape() {
        System.out.println("4 door car");
    }

    @Override
    public void start() {
        System.out.println("turn the key to start");
        System.out.println("max speed is:" +maxSpeed);

    }

    @Override
    public void brake() {
        System.out.println("brake to stop");

    }

    public void color(){
        System.out.println("white color");
    }

    //in order to implement an abstract method, we need to use "extends" keyword for abstract class
    @Override
    public void navigation() {
        System.out.println("gps");
    }

    @Override
    public void engine() {
        System.out.println("v8");
    }

    @Override
    public void fuelType() {
        System.out.println("diesel");
    }
}
