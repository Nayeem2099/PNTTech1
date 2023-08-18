package oops.abstraction;

public class Honda implements Car{
    @Override
    public void shape() {
        System.out.println("5 door car");
    }

    @Override
    public void start() {
        System.out.println("keyless entry");
    }

    @Override
    public void brake() {
        System.out.println("automatic brakes");
    }
}
