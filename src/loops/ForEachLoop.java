package loops;

public class ForEachLoop {

    public static void main(String[] args) {

        int[] array = {9,7,0,1,2};

        for (int a: array){
            System.out.println(a);

            /* how to print out using for loop instead (harder)

            System.out.println(array[0]);
            System.out.println(array[1]);
            System.out.println(array[2]);
            System.out.println(array[3]);
            System.out.println(array[4]);

            for (int i=0; i<5; i++){
                System.out.println(array[i]); Prints 9,7,0,1,2
            } */
        }
        String[] menu = {"biryani", "couscous", "hummus", "pulao"};
        for (String dish: menu){
            System.out.println(dish);
        }
    }
}

//foreach loops is also called enhanced for loops.