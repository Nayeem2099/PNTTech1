package collections.list;

import java.util.ArrayList;

public class UseArrayList {
    public static void main(String[] args) {
        //generic list - no data type
        ArrayList list = new ArrayList();
        list.add(2);
        list.add(3);
        list.add(5);
        list.add(0);
        list.add(6);
        list.add("Cucumber");
        System.out.println(list);
        System.out.println(list.get(3));


        for (int i = 0; i < list.size(); i++) { //use size for collections, length for arrays
            System.out.println(list.get(i));
        }
        System.out.println(list.get(0)); //how to print indexes

        //typed list
        ArrayList<Integer> numbers = new ArrayList<>(); //you can assign type if you want
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
