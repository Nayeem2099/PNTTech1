package condition;

import classmethodobject.House;
import modifiersaccess.Calculator;

public class Condition {

    public static void main(String[] args) {
        int a = 0;
        System.out.println("first line");
        if(a>0){
            System.out.println("this number is positive");
        } else if (a<0) {
            System.out.println("this number is negative");
        } else {
            System.out.println("this number is 0");
        }
        System.out.println("last line");

        //used to show how importing Classes work
        //imported from two other classes
        Calculator cal = new Calculator();
        cal.sum(10,20);

        House house = new House();
        System.out.println(house.bedroom());


    }
}
