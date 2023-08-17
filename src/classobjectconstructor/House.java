package classobjectconstructor;

public class House {

    //variables
    int numberOfRooms;
    String color = "white";

    //constructors - has to have same name as class
    //default constructor
    House(){
    }
    //built constructor
    House(int myNumberOfRooms) {
        numberOfRooms = myNumberOfRooms;
    }
    House(String myColor){
        color = myColor;
    }
    House(int myNumberOfRooms, String myColor){
        numberOfRooms = myNumberOfRooms;
        color = myColor;
    }

    //methods
    void room(){
        System.out.println("zzzzz");
        System.out.println("number of rooms = " + numberOfRooms);
    }
    void kitchen(){
        System.out.println("yummy");
    }
    void bathroom(){
        System.out.println("lalalala");
        System.out.println("the color of the bathroom = " + color);
    }

}
