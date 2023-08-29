package collections.set;

import java.util.LinkedHashSet;

public class UseLinkedHashset {

    public static void main(String[] args) {

        LinkedHashSet<Integer> numbers = new LinkedHashSet<>(); //you can assign type if you want
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(6);
        numbers.add(0); //will not print out duplicates
        numbers.add(0);
        System.out.println(numbers);
    }
}
