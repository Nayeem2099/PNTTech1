package collections.list;

import java.util.Stack;

public class UseStack {

    public static void main(String[] args) {

        Stack<Integer> numbers = new Stack<>(); //you can assign type if you want
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(6);

        numbers.peek();
        numbers.pop();
        System.out.println(numbers);

    }
}
