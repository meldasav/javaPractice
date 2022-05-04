package date_practices;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Practice_Date_Format {
    public static void main(String[] args) {
        Date currentDate=new Date();
        System.out.println(currentDate);
        //MM/dd/yyyy
        SimpleDateFormat sdf=new SimpleDateFormat("MM/dd/yyyy");
        System.out.println("Today is " + sdf.format(currentDate));

        // re assign sdf in different format
        sdf=new SimpleDateFormat(" EEE:hh:mm a");
        System.out.println("Time is " + sdf.format(currentDate));
        System.out.println(new SimpleDateFormat("EEEE").format(currentDate));
        System.out.println(new SimpleDateFormat("E,MMM-dd yyyy").format(currentDate));

        /**
         * Write a program ask user to enter their date of year then calculate their age and print with the message
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("please enter your birth year");
        int year= scan.nextInt();
        Date date=new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("yyyy");
        int currentYear=Integer.parseInt(dateFormat.format(date));
        System.out.println("you are " + (currentYear-year));


    }
}
