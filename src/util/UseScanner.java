package util;

import java.util.Scanner;

public class UseScanner {

    public static void main(String[] args) {

        //user input
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter a number:");
        num = sc.nextInt(); //action of capturing the value //num declaration is action of storing value

        if (num % 2 == 0){
            System.out.println("this number is even");
        } else {
            System.out.println("this number is odd");
        }
    }
}
