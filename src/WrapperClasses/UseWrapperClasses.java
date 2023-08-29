package WrapperClasses;

import java.util.Scanner;

import static java.time.LocalTime.now; //static import

public class UseWrapperClasses {
    public static void main(String[] args) {


        //byte,short,int,long,float,double,boolean,char
        //primitive variables - defined by java itself.
        //below is instance variables, capitalized. You can only use instance variables with collections.
        //instance variables - String, Byte, Short, Integer, Long, Float, Double, Char, Boolean
        //Wrapper classes can let you access primitives as objects.
        Byte b = 125;
        Short s = 23423;
        Integer i = 342903432;
        Long l = 274272245L;
        Float f = 3255.23432F;
        Double d = 422343.14132412;
        Character c = 'd';
        Boolean bool = true;

        System.out.println();
        Scanner sc = new Scanner(System.in);

        //LocalTime localTime = LocalTime.now(); //static method so no object needed
        System.out.println(now());

    }


}
