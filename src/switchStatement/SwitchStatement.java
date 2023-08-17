package switchStatement;

import java.util.Scanner;

public class SwitchStatement {

    public static void main(String[] args) {

        //String day = "Friday";
        String day;
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the day:");
        day = sc.nextLine();

        switch (day){
            case "Monday":
                System.out.println("school");
                break;
            case "Tuesday":
                System.out.println("review java");
                break;
            case "Wednesday":
                System.out.println("do codelabs");
                break;
            case "Thursday":
                System.out.println("do assignment");
                break;
            case "Friday":
                System.out.println("do gym");
                break;
            case "Saturday":
                System.out.println("practice java");
                break;
            case "Sunday":
                System.out.println("submit assignment");
                break;
            default:
                System.out.println("invalid day");
        }
    }
}
