package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class UnderstandingDateFormat {
    public static void main(String[] args) {
        Date currentDate = new Date();

        System.out.println(currentDate); // Sat Apr 30 10:15:19 CDT 2022

        // MM/dd/yyyy  04.30.2022

        SimpleDateFormat sdf = new SimpleDateFormat("MM.dd.yyyy");
        System.out.println("Today is = " + sdf.format(currentDate));


        // Print date in the format of Sat 10:27 AM
        sdf = new SimpleDateFormat("E hh:mm a");
        System.out.println(sdf.format(currentDate));

        System.out.println(new SimpleDateFormat("EEEE").format(currentDate)); // Saturday
        System.out.println(new SimpleDateFormat("yyyy").format(currentDate)); // 2022
        System.out.println(new SimpleDateFormat("hh 'o''clock' a, zzzz").format(currentDate)); //


/**
Write a program that asks user to enter their date of year
Then calculate their age and print with the message below

EXPECTED OUTPUT:
You are {age} years old!

 */

        Scanner scan =new Scanner(System.in);
        System.out.println("Please enter your year of birth");
        int YOB=scan.nextInt();
        Date date =new Date();

        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy");
        System.out.println("You are " + (Integer.parseInt(dateFormat.format(date)) -YOB)+ " years old");


       //2.WAY
        System.out.println("Hey, please enter your year of birth");
        System.out.println("You are " + (Integer.parseInt(new SimpleDateFormat("yyyy").format(new Date())) - new Scanner(System.in).nextInt()) + " years old!");

       //3.WAY

        System.out.println("Hey, please enter your year of birth");
        int YOB1 = scan.nextInt();

        Date date1 = new Date();
        SimpleDateFormat dateFormat1 = new SimpleDateFormat("yyyy");

        int currentYear = Integer.parseInt(dateFormat.format(date));

        System.out.println("You are " +  (currentYear - YOB) + " years old!");











    }







    }








