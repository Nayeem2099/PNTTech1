package classobjectconstructor;

import java.util.Scanner;

public class UseHouse {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        House myHouse = new House();
        myHouse.room();
        myHouse.kitchen();
        myHouse.bathroom();

        House yourHouse = new House(10);
        yourHouse.room();
        House hisHouse = new House("red");

        House herHouse = new House(20,"pink");
        herHouse.bathroom();






    }
}
