package classmethodobject;

public class House {

    //class properties
    //variables
    int numberOfRooms = 5;
    String colorOfHouse = "white";

    //methods
    //non return methods
    void kitchen() {
        //whatever is inside the curly braces is called the body of the method
        System.out.println("yummy yummy");
    }
    //return methods
    String bathroom() {
        return "value"; //equivalent to String bathroom = "value";
    }
    public int bedroom() {
        return 5; //equivalent to int bedroom = 5;
    }
    double livingRoom() {
        return 1.21423d; //equivalent to double bedroom = 1.21423d
    }
    byte room1(){
        return 124;
    }
    short room2(){
        return 15432;
    }
    long room3(){
        return 3453124;
    }
    float room4(){
        return 1.333f;
    }
    char room5(){
        return '&';
    }
    boolean room6(){
        return true;
    }
}
