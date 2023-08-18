package oops.polymorphism;

public class Calculator {

    double pi = 3.14;
    //method overloading - when two methods have the same name but different number of parameters.
    //compile time polymorphism
    public void add(int a, int b){
        int total = a + b;
        System.out.println(total);

    }
    public void add(int a, int b, int c){
        int total = a + b + c;

    }

    public void division(int a , int b){
        int total = a / b;
        System.out.println(total);

    }
}
