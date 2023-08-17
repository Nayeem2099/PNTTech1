package classmethodobject;

public class UseHouse
{

public static void main(String[] args) {

        //String str = new String();
        //Scanner sc = new Scanner(System.in);
        House whiteHouse = new House();//object of the class House
        System.out.println(whiteHouse.numberOfRooms); //we use objects to access House properties
        System.out.println(whiteHouse.colorOfHouse);
        whiteHouse.kitchen();
        //print return method, you cannot print void method
        System.out.println(whiteHouse.bedroom());

        Calculator cal = new Calculator();
        cal.sum(5,5);
        System.out.println(cal.sub());

        //class assignment
        Circle circ = new Circle();
        circ.perimeter(7.5);
        System.out.println("The area of a circle with a 7.5 radius is " + circ.area(7.5));

        }
        }