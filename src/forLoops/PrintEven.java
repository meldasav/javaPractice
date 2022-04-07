package forLoops;

import utilities.MathHelper;

public class PrintEven {
    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }

        }
        for (int i = 0; i <= 10; i++) {
            if (MathHelper.isEven(i)) {
                System.out.println(i);
            }
        }
        for (int i = 0; i < 10; i++) {
            System.out.println(i++);

        }

        int year = 2022;
        for (int age = 10; age <= 35; age++) {
            System.out.println("the age is now " + age + " in " + year);
            year++;
        }

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) System.out.println(i);
        }
        for (int i = 0; i <= 10; i++) {
            if (MathHelper.isEven(i)) System.out.println(i);
        }

    }
}