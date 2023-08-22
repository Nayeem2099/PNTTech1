package nestedclass;

public class UseNestedClass{

    public static void main(String[] args) {

        //object of outer class
        Outer outer = new Outer();
        outer.outerMethod();

        //use object of outer class to class the object of the inner class to access the inner class properties.
        outer.inner.InnerMethod();
    }
}
