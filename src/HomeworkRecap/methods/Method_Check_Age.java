package HomeworkRecap.methods;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Method_Check_Age {
    public static void main(String[] args) {
        checkAge(1983);
        checkAge(2007);
    }

    /**
     * -Create a method called checkAge()
     * -This method will take an int yearOfBirth as  argument and it will print
     * message below based on the entry
     * If the age is less than 16, then print “AGE IS NOT ALLOWED”
     * If the age is 16 or more, then print “AGE IS ALLOWED”
     * If the age is more than 100 or a future year entered, print “AGE IS NOT
     * VALID”
     * NOTE: Calculate the age taking base year as current year in a dynamic
     * way. You can use Date class.
     */
    public static void checkAge(int yearOfBirth) {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy");
        int currentYear = Integer.parseInt(dateFormat.format(date));
        int currentAge = currentYear - yearOfBirth;
        if (currentAge > 0 && currentAge < 16) System.out.println("AGE IS NOT ALLOWED");
        else if (currentAge >= 16 && currentAge <= 100) System.out.println("AGE IS ALLOWED");
        else System.out.println("Age is not allowed");

    }

}

