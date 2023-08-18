package oops.abstraction;

public abstract class ModernCar {

    //abstract class is a hybrid class/interface.
    //abstract classes can have abstract and nonabstract methods.

    public abstract void navigation();      //abstract method
    public void autoRadio(){            //nonabstract method
        System.out.println("Integrated auto radio");
    }

}
