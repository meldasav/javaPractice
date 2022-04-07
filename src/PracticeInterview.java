import java.util.Scanner;

public class PracticeInterview {
    public static void main(String[] arg){
//        System.out.println("i start to practice \"java\"today,and i like it.\n");
//        System.out.println("\"Don't limit yourself.\"");
//        System.out.println(" it's not the load that breaks you down,it's the way you carry\n it.");
//        System.out.println("\t Java is easy to write and easy to run-this is\n " +
//                "the foundational strength of java and why many\n" +
//                " developers program init.When you write Java\n" +
//                " once, you can run it almost anywhere at anytime");
        //Scanner scan=new Scanner(System.in);
//        System.out.println("what is your first name?");
//        String firstName=scan.nextLine();
//        System.out.println("how old are you?");
//        int age=scan.nextInt();

//        System.out.println("what is your balance?");
//        String balance= scan.nextLine();
//        System.out.println("enter your transactions");
//        String transaction1= scan.nextLine(),transaction2= scan.nextLine(),transaction3= scan.nextLine();
//        double balanceD=Double.parseDouble(balance),transaction1D=Double.parseDouble(transaction1),transaction2D= Double.parseDouble(transaction2),
//                transaction3D=Double.parseDouble(transaction3);
//        double myFirstBalance=(balanceD-transaction1D);
//        double mySecondBalance=(myFirstBalance-transaction2D);
//        double myLastBalance=(mySecondBalance-transaction3D);
//        System.out.println(myLastBalance);


//        System.out.println("what is your full name?");
//        String name= scan.nextLine();
//        System.out.println("enter your 3 kids age");
//        String age1= scan.next(),age2= scan.next(),age3= scan.next();
//        int age1Int=Integer.parseInt(age1),age2Int=Integer.parseInt(age2),age3Int=Integer.parseInt(age3);
//        int oldest=Math.max(Math.max(age1Int,age2Int),age3Int);
//        int youngest=Math.min(Math.min(age1Int,age2Int),age3Int);
//        System.out.println(Math.abs(oldest-youngest));


//           int nb=45;
//           int nb1=34;
//           String srt=String.valueOf(nb)+nb1;
//           System.out.println(srt);

//        int number=40;
//        if(number%2==0){
//            System.out.println("even number");
//
//        }else{
//            System.out.println("odd number");
//
//
//        }
//
//        boolean isThereGameTonight=false;
//        if(isThereGameTonight){
//            System.out.println("i will watch the game.");
//        }else{
//            System.out.println("i will go out");
//
//        }

        Scanner scan=new Scanner(System.in);
        System.out.println("please enter a number?");
        int number1=scan.nextInt();
        if(number1%2==0){
            System.out.println("The number you entered is even");

        }else{
            System.out.println("the number you entered is odd!");
        }
    }
}
