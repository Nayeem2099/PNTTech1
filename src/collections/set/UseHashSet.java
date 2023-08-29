package collections.set;

import java.util.HashSet;

public class UseHashSet {

    public static void main(String[] args) {

        //hash set gets a random order, unless its numbers.
        HashSet<Integer> numbers = new HashSet<>(); //you can assign type if you want
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(6);
        numbers.add(0); //will not print out duplicates
        numbers.add(0);
        System.out.println(numbers);

        HashSet<String> names = new HashSet<>();
        names.add("david");
        names.add("casi");
        names.add("fouad");
        names.add("modric");
        System.out.println(names);
    }
}
