package oops.polymorphism;

public class UseCalculator{

    public static void main(String[] args) {

        Calculator cal = new Calculator();

        cal.add(5,7);
        cal.add(5,7,8);

        cal.division(10,5);

        ModernCalculator mcal = new ModernCalculator();
        mcal.add(5,5);
    }
}
