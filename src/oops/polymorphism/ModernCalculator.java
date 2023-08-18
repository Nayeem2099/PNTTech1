package oops.polymorphism;

public class ModernCalculator extends Calculator{

    //method overriding is when two methods have the same name and the same number of parameters but different body.
    //method overriding only happens with separate classes linked by inheritance.
    //runtime polymorphism

    @Override //use this annotation whenever you're overriding a method. For readability purposes.
    public void add(int a, int b){
        int total = a + b + 10;
        System.out.println(total);

    }
}
