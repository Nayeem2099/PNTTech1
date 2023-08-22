package oops.inheritance;

public class Son extends Father {

    //super keyword gives reference to superclass from subclass
    Son(){
    //   super(7);
    }
    public void hasCar(){
        super.hasCar();
        super.numberOfSport = 8;
    }

}
