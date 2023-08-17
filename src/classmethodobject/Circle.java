package classmethodobject;

public class Circle {
    //class assignment
    //circle perimeter

    double pi = 3.14;
    void perimeter(double radius){
        double perimeter = 2*3.14*radius;
        System.out.println("perimeter of a circle is " + perimeter);
    }
    //circle area

    double area (double radius){
        double area = pi * (radius*radius);
        return area;
    }
}


//recursion is when a method calls itself... Creates an infinite loop.
// Method keeps calling itself over and over until error.
