package homeworks;

import methods.FindSpecialsInStringMethod;

import java.util.Arrays;

public class Homework12 {
    public static void main(String[] args) {
        System.out.println("...........TASK1...........");
        int[] task1numbers = new int[10];
        task1numbers[2] = 23;
        task1numbers[4] = 12;
        task1numbers[7] = 34;
        task1numbers[9] = 7;
        task1numbers[6] = 15;
        task1numbers[0] = 89;
        System.out.println(task1numbers[3]);
        System.out.println(task1numbers[0]);
        System.out.println(task1numbers[9]);
        System.out.println(Arrays.toString(task1numbers));

        System.out.println("...........TASK2...........");

        String[] task2name = new String[5];
        task2name[1] = "abc";
        task2name[4] = "xyz";
        System.out.println(task2name[3]);
        System.out.println(task2name[0]);
        System.out.println(task2name[4]);
        System.out.println(Arrays.toString(task2name));

        System.out.println("...........TASK3...........");
        int[] task3number = {23, -34, -56, 0, 89, 100};
        System.out.println(Arrays.toString(task3number));
        Arrays.sort(task3number);
        System.out.println(Arrays.toString(task3number));

        System.out.println("...........TASK4...........");
        String[] task4countries = {"Germany", "Argentina", "Ukraine", "Romania"};
        System.out.println(Arrays.toString(task4countries));
        Arrays.sort(task4countries);
        System.out.println(Arrays.toString(task4countries));

        System.out.println("...........TASK5...........");

        String[] task5cartoon = {"Scooby Doo", "Snoopy", "Blue", "Pluto", "Dino", "Sparky"};
        System.out.println(Arrays.toString(task5cartoon));
        boolean isPluto = false;
        for (String cartoon : task5cartoon) {
            if (cartoon.equals("Pluto")) {
                isPluto = true;
                break;
            }
        }
        System.out.println(isPluto);

        System.out.println("...........TASK6...........");

        String[] task6cartoon = {"Garfield", "Tom", "Sylvester", "Azrael"};
        Arrays.sort(task6cartoon);
        System.out.println(Arrays.toString(task6cartoon));
        System.out.println(Arrays.binarySearch(task6cartoon, "Garfield") >= 0 && Arrays.binarySearch(task6cartoon, "Felix") >= 0);


        System.out.println("...........TASK7...........");

        double[] task7numbers = {10.5, 20.75, 70, 80, 15.75};
        System.out.println(Arrays.toString(task7numbers));
        System.out.println(task7numbers[0]);
        System.out.println(task7numbers[1]);
        System.out.println(task7numbers[2]);
        System.out.println(task7numbers[3]);
        System.out.println(task7numbers[4]);

        System.out.println("...........TASK8...........");
        char[] task8 = {'A', 'b', 'G', 'H', '7', '5', '&', '*', 'e', '@', '4'};
        int counterLetter = 0, counterUpper = 0, lowerCase = 0, digit = 0, specials = 0;
        System.out.println(Arrays.toString(task8));
        for (int i = 0; i < task8.length; i++) {
            if (Character.isLetter(task8[i])) {
                counterLetter++;
                if (Character.isUpperCase(task8[i])) {
                    counterUpper++;
                } else {
                    lowerCase++;
                }
            } else if (!Character.isLetter(task8[i]) && (!Character.isDigit(task8[i])) && (!Character.isWhitespace(task8[i]))) {
                specials++;
            } else {
                digit++;
            }

        }
        System.out.println("Letters = " + counterLetter);
        System.out.println("Uppercase letters =" + counterUpper);
        System.out.println("Lowercase letters = " + lowerCase);
        System.out.println("Digits = " + digit);
        System.out.println("Special characters = " + specials);

        System.out.println("...........TASK9...........");


        String[] task9 = {"Pen", "notebook", "Book", "paper", "bag", "pencil", "Ruler"};

        int countU = 0, countBorP = 0, countBookAndPen = 0, countLow = 0;
        for (String str : task9) {
            char c = str.charAt(0);
            int i = c;

            if (i >= 65 && i <= 90) {
                countU++;
            } else {
                countLow++;
            }
            if (str.toUpperCase().startsWith("B") || str.toUpperCase().startsWith("P")) {
                countBorP++;
                if ((str.toLowerCase().contains("book") || (str.toLowerCase().contains("pen")))) {
                    countBookAndPen++;

                }
            }
        }
        System.out.println(Arrays.toString(task9));
        System.out.println("Elements starts with uppercase = " + countU);
        System.out.println("Elements starts with lowercase = " + countLow);
        System.out.println("Elements starting with B or P = " + countBorP);
        System.out.println("Elements having ”book” or “pen”= " + countBookAndPen);


        System.out.println("...........TASK10...........");
        int[] task10 = {3, 5, 7, 10, 0, 20, 17, 10, 23, 56, 78};

        int countEqual10 = 0, count10 = 0, countLess10 = 0;
        for (int number10 : task10) {
            if (number10 == 10) {
                countEqual10++;
            } else if (number10 > 10) {
                count10++;
            } else {
                countLess10++;

            }
        }
        System.out.println(Arrays.toString(task10));
        System.out.println("Elements that are 10 = " + countEqual10);
        System.out.println("Elements that are more than 10 = " + count10);
        System.out.println("Elements that are less than 10 = " + countLess10);


        System.out.println("...........TASK11...........");
        int[] result = new int[5];
        int[] first = {5, 8, 13, 1, 2};
        int[] second = {9, 3, 67, 1, 0};

        System.out.println(Arrays.toString(first));
        System.out.println(Arrays.toString(second));

        for (int i = 0; i < result.length; i++) {
            result[i] = Math.max(first[i], second[i]);
        }
        System.out.println(Arrays.toString(result));


    }

}





