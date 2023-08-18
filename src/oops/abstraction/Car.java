package oops.abstraction;

public interface Car {

    //variables in interface are final by default.
    int maxSpeed = 160;

    //abstract methods - does not have body
    //abstract methods are public by default
    public void shape();

    public void start();

    public void brake();


}
