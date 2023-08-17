package classmethodobject;

public class Calculator {

    //properties
    //variables
    int a = 5;
    int b = 1;

    //methods
    //non-return
    void sum(int x, int y){  //pass parameters
        //implement
        int total = x + y;
        System.out.println(total);

    }
    //return
    int sub(){
        sum(5,5); //you can call a method within same class this way
        int total = a - b;
        return total;
    }

}
