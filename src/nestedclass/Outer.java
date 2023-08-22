package nestedclass;

public class Outer { //outer class or superclass (parent)

    //outer class is the parent class
    //inner class is the child class

    int outerVar = 15;

    Outer(){

    }
    //must create object of inner class to access inner properties.
    Inner inner = new Inner();

    public void outerMethod(){
        System.out.println("This is the outer class method");
    }
    //subclass or inner class
    public class Inner{

        int InnerVar = 20;

        public Inner(){

        }

        public void InnerMethod(){
            System.out.println("This is inner class method");
        }
    }

}
