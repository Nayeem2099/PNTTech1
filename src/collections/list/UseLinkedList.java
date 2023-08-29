package collections.list;

import java.util.LinkedList;

public class UseLinkedList {

    public static void main(String[] args) {

        LinkedList<Integer> numbers = new LinkedList<>(); //you can assign type if you want
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(6);
        System.out.println(numbers);

        numbers.remove(1);
        System.out.println(numbers);
        numbers.add(2, 9); //how to add 9 into index 2
        System.out.println(numbers);
        numbers.add(45);
        System.out.println(numbers);
        numbers.set(5,852); //used to overwrite
        System.out.println(numbers);
        numbers.add(6, 9872);
        System.out.println(numbers);
    }
    }

