package homePractice;

import java.util.Scanner;

public class Scn1 {
    public static void main(String[] args){

//        int x,y,z,sum;
//
//            Scanner scanner=new Scanner(System.in);
//        System.out.println("Please enter number 1?");
//        x=scanner.nextInt();
//        System.out.println("Please enter number 2?");
//        y=scanner.nextInt();
//        System.out.println("Please enter number 3?");
//        z=scanner.nextInt();
//        sum=(x+y+z);
//        System.out.println("The sum of the numbers you entered is "+sum);
//        int x,y,z,sum;

//               int nb1,nb2,nb3,sum;
//              Scanner collect=new Scanner(System.in);


//        System.out.println("Please enter the number 1?");
//        x = scan.nextInt();
//        System.out.println("Please enter the number 2?");
//        y=scan.nextInt();
//        System.out.println("Please enter the number 3?");
//        z= scan.nextInt();
//        sum=x+(y+z);
//        System.out.println("The sum of the numbers you entered is "+sum);

//        System.out.println(" Please enter your first name?");
//        String name=scan.nextLine();
//
//        System.out.println("Please enter your last name?");
//        String lastname=scan.nextLine();
//
//        System.out.println("Your full name is "+name+"  "+lastname+".");


//        System.out.println(" Please put your first name?");
//        String name=scan.nextLine();
//        System.out.println("The name user put =" +name);


//        int nb1,nb2,nb3,sum;
         Scanner collect=new Scanner(System.in);           //method
//
//        System.out.println("Please enter number 1?");    //Print out the question
//        nb1=collect.nextInt();                           //get the number by the nextInt () method and store it
//
//        System.out.println("Please enter number 2");     // Print out the question
//        nb2=collect.nextInt();                           //get the number by the nextInt () method and store it

//        System.out.println("Please enter number 3");     //Print out the question
//        nb3=collect.nextInt();                           //get the number by the nextInt () method and store it
//
//
//        sum=nb1+(nb2+nb3);                                //store the answer in object name in sum
//        System.out.println("The sum of the numbers you entered is "+sum);//print out the answer


//        System.out.println(" Please enter your full address?");
//        // note what is needed from user
//        String address=collect.nextLine();
//        // variableName /object = class name /method
//
//        System.out.println("Your address is  "+address);
//        //question response


//   pseuDo code
        //1.create an object of scanner
        //2.print out the question
        //3.get the address by the nextline () method and store it
        // 4.print out user address
//        Scanner userInput=new Scanner(System.in);
//
//        System.out.println("what is your name?");
//        String name=userInput.next();
//        System.out.println("how old are you?");
//        int age= userInput.nextInt();
//        System.out.println("my brain ok?");
//        boolean brain= userInput.nextBoolean();
//        System.out.println("what is your address?");
//        userInput.nextLine();//why?
//        String adr=userInput.nextLine();
//        System.out.println("my name is "+name+ "i am "+age+brain+adr);

      //  System.out.println('g' + 'k' + " " + 'h' + 'g')

        System.out.println(" what is your first name?");
        String name= collect.nextLine();

        System.out.println("what is your last name?");
        String lName=collect.nextLine();

        System.out.println("how old are you?");
        int age= collect.nextInt();

        System.out.println("What is your email address?");
        collect.nextLine();
        String email=collect.nextLine();

        System.out.println("What is your phone number?");
        String phone=collect.nextLine();

        System.out.println("What is your address?");
       // collect.nextLine();
        String address=collect.nextLine();
        System.out.println("\t User who joined this program is  " + name + " " + lName + "." +" John's age is \n" + age + "." +
                " John's email address is  " + email + "." + " phone number is \n" + phone + "." + " and address is " + address + "."+"\n");


        // TASK 2
        System.out.println(" What is your favorite book?");
        String book =collect.nextLine();

        System.out.println("What is your favorite color?");
        String clr=collect.nextLine();

        System.out.println("What is your favorite number?");
        int fb=collect.nextInt();

        System.out.println("User’s favorite book is : " + book + " \n " + "User’s favorite color is: " + clr + " \n " + "User’s favorite number is: " + fb + ".");







    }
}
