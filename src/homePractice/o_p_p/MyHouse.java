package homePractice.o_p_p;

import java.util.Scanner;

public class MyHouse {
    public static void main(String[] args) {
        House myHouse=new House();
        Scanner input=new Scanner(System.in);
        System.out.println("please enter type of the house");
        myHouse.type= input.nextLine();
        System.out.println("please enter address");
        myHouse.address=input.nextLine();
        System.out.println("please enter number of rooms");
        myHouse.numOfRooms=input.nextInt();
        myHouse.info();
    }
}
