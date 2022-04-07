package casting;

import java.util.Scanner;

public class ExerciseRecap {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);

        /*
        Write a program that asks users their balance as
a string and asks for 3 transactions as string end
print out the end result as double.


Input:
"What is your balance?"
user:
456.7

"What is your next 3 transactions?
user:
34.1
65.3
28.4

Output:
"Your balance is now = x"

*/




//        System.out.println("Please enter your balance");
//        double total= scan.nextDouble();
//        System.out.println("please enter 3 transaction?");
//        double balance1=scan.nextDouble();
//        double balance2=scan.nextDouble();
//        double balance3=scan.nextDouble();
//
//        double totalB=(balance1+balance2+balance3);
//        double totalRemainder=(total-totalB);
//
//        String newRemainder=" "+totalRemainder;
//        System.out.println(newRemainder);

    /*
    Write a program ASK user for full name, age, phone number then
enter their 3 kids age as string then print out everything plus
the oldest kid, youngest and the age difference between oldest
and youngest.

Program: "Please enter your name"
User: John Doe
Program: "Please enter your age:
User: 45
Program: "Please enter your phone number:
User: (123) 123 1234
Program: "Enter the ages of your kids"
User:
12
22
17
Program:
Your name is John Doe, your phone number is (123) 123 1234,
You are 45 years old, Your oldest kid is 22 years old, your
youngest is 12, difference between oldest and youngest is 10
years.

 */
        System.out.println("What is your full name?");
        String name= scan.nextLine();
        System.out.println("What is your age?");
        String age= scan.next();
        scan.nextLine();
        System.out.println("please enter your phone number?");
        String phoneNumber= scan.nextLine();
        System.out.println("Enter your 3 kids age?");
        String age1= scan.next(), age2= scan.next(), age3= scan.next();
        int age1Int=Integer.parseInt(age1),age2Int=Integer.parseInt(age2),age3Int=Integer.parseInt(age3);
        Math.max(age1Int,age2Int);
        Math.max(age3Int, Math.max(age1Int,age2Int));
        int oldestKid=Math.max(age3Int, Math.max(age1Int,age2Int));
        int youngestKid=Math.min(age3Int, Math.min(age1Int,age2Int));
        int ageDifference=Math.abs(oldestKid-youngestKid);
        System.out.println("Your name is " +name+", your phone number is " + phoneNumber+
                ",\nYou are " + age+" years old, +  Your oldest kid is " + oldestKid + " years old, your"+
                "\nyoungest is " + youngestKid+",difference between oldest and youngest is " +ageDifference+
                "\nyears.");





    }
}
