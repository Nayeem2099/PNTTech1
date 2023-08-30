package datastructure.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UseIterator {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(); //you can assign type if you want
        numbers.add(2);
        numbers.add(3);
        numbers.add(5);
        numbers.add(0);
        numbers.add(6);

        System.out.println(numbers);
        System.out.println(numbers.get(1));

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
        for (int number: numbers){ //foreach or enchancedfor loop - used for arrays and collections
            System.out.println(number);
        }
        Iterator<Integer> it = numbers.iterator(); //****step one to turn list into iterator
//        System.out.println(it.hasNext()); //to see if you have a next value
//        System.out.println(it.next() + " Iterator effect");
//        System.out.println(it.hasNext());
//        System.out.println(it.next() + " Iterator effect") ;
//        System.out.println(it.hasNext());
//        System.out.println(it.next() + " Iterator effect");
//        System.out.println(it.hasNext());
//        System.out.println(it.next() + " Iterator effect");
//        System.out.println(it.hasNext());
//        System.out.println(it.next() + " Iterator effect");
//        //System.out.println(it.next() + " Iterator effect"); - will give you error since there is no 6th element
//        System.out.println(it.hasNext());

        while(it.hasNext()){  //very common in iterators
            System.out.println(it.next());
        }

        List<String> names = new ArrayList<>(); //could use List<String> or ArrayList
        names.add("Kamel");
        names.add("Boris");
        names.add("Fouad");


        Iterator<String> it1 = names.iterator(); //could use just Iterator without the <string>

        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.hasNext());
        System.out.println(it1.next());
        System.out.println(it1.hasNext());

//        Could use this instead to list all the elements of the list
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }

        List<Object> names1 = new ArrayList<>(); //generic list - no specific type
        names1.add("Boris");
        names1.add("Komel");
        names1.add(123);

        for (Object names2 : names1){  //Use "Object" class in foreach loop for Array with different data types
            System.out.println(names2);
        }


    }
}
