package oops.abstraction;

public class Use {

    public static void main(String[] args) {

        Toyota corolla = new Toyota();
        corolla.brake();
        corolla.shape();
        corolla.start();
        corolla.color();


        //you can create it this way since Toyota implements Car
        //when you create object using the interface name, you only have access to methods of the used interface
        Car camry = new Toyota();
        camry.brake();
        camry.shape();
        camry.start();

        Motor sienna = new Toyota();
        sienna.engine();
        sienna.fuelType();

        Honda civic = new Honda();
        civic.brake();
        civic.shape();
        civic.start();

        Car accord = new Honda();

    }
}
