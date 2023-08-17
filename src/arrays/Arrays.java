package arrays;

public class Arrays {

    public static void main(String[] args) {
        // one dimension array
        //in-line array declaration and assignment
        int[] array = {9,7,0,1,2};

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);
        System.out.println(array[3]);
        System.out.println(array[4]);

        //array declaration (5 is the number or varibles in array)
        char[] array2 = new char[5];
        //array assignment
        array2[0] = 'g';
        array2[1] = '^';
        array2[2] = '1';
        array2[3] = '3';
        array2[4] = '4';

        System.out.println(array2[0]);
        System.out.println(array2[1]);
        System.out.println(array2[2]);
        System.out.println(array2[3]);
        System.out.println(array2[4]);

        //two dimensional array
        int[][] array3 = {{9,8}, {0,5}};
        System.out.println(array3[0][0]);
        System.out.println(array3[0][1]);
        System.out.println(array3[1][0]);
        System.out.println(array3[1][1]);

        //two dimension array declaration (2 values in each bracket)
        char[][] array4 = new char[2][2];
        //array assignment
        array4[0][0] = 'a';
        array4[0][1] = 'b';
        array4[1][0]= 'c';
        array4[1][1] = 'd';

        System.out.println(array4[0][0]);
        System.out.println(array4[0][1]);
        System.out.println(array4[1][0]);
        System.out.println(array4[1][1]);

        //two dimension array with 3 in each group.
        char[][] array5 = new char[2][3];



    }

}
