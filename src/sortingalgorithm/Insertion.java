package sortingalgorithm;

public class Insertion {

    public static void main(String[] args) {

        int array[] = {7,5,1,0,8,3,2,4,9,6};
        int temp;

        //print the array before sorting
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j >0 ; j--) {
                if (array[j] < array[j - 1]) {
                    temp = array[j];
                    array[j] = array[j - 1];
                    array[j - 1] = temp;
                }

            }
        }

        //print the array after sorting
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        }

        }
