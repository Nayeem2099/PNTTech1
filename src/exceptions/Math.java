package exceptions;

public class Math {

    public static void main(String[] args) {
        //runtime exception (unchecked error)
        System.out.println("line 1");
        System.out.println("line 2");
        System.out.println("line 3");
        System.out.println("line 4");
        System.out.println("line 5");
        try{
            System.out.println("line 6" + 10/0);
        } catch (ArithmeticException e){
            System.out.println("line 6 error");
        }
        System.out.println("line 7");
        System.out.println("line 8");
        System.out.println("line 9");

    }
}
