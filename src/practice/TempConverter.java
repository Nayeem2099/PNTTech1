package practice;

import java.util.Scanner;

public class TempConverter {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int mode;
        int convertedTemp; //fahrenheit
        int tempToConvert = 0; //celsius
        int answer = 0;
        int begin;

        //greet the user: welcome
        System.out.println("Welcome");
        //header: to temp converter
        System.out.println("-------to temp converter--------");
        System.out.println("Do you want to convert temp?");
        System.out.println("1 - yes");
        System.out.println("2 - no");
        begin = sc.nextInt();

        if (begin == 1) {
            do {
                //do you want to convert temp?
                //System.out.println("Do you want to convert temp?");
                //y/n (1-y/2-n)?
                //System.out.println("1 - yes");
                //System.out.println("2 - no");

                //case yes:
                System.out.println("Choose the conversion mode");
                System.out.println("1 - C to F");
                System.out.println("2 - F to C");
                //chose the conversion mode:
                //1- c to f
                //2 - f to c
                mode = sc.nextInt();

                //case 1:

                if (mode == 1) {
                    //enter the temp to convert
                    // do the conversion from c to f
                    //show the result
                    System.out.println("enter the temp to convert in C ");
                    tempToConvert = sc.nextInt();
                    convertedTemp = (tempToConvert * 9 / 5) + 32;
                    System.out.println(tempToConvert + " C = " + convertedTemp + " F");
                } else if (mode == 2) {
                    //case 2:
                    //enter the temp to convert
                    // do the conversion from f to c
                    //show the result
                    System.out.println("enter the temp to convert in F ");
                    tempToConvert = sc.nextInt();
                    convertedTemp = (tempToConvert - 32) * 5 / 9;
                    System.out.println(tempToConvert + " F = " + convertedTemp + " C");

                }


                //do you want to convert another temp?
                //y/n(1-y/2-n)
                System.out.println("Do you want to convert another temp?");
                System.out.println("1 - yes");
                System.out.println("2 - no");
                answer = sc.nextInt();

            } while (answer == 1);
            System.out.println("goodbye, see you soon!!");
            //greet: goodbye,see you soon
        } else {
            System.out.println("goodbye, see you soon!!");
        }


    }
}

