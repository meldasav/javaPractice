package homeworks;

import java.util.Arrays;

public class Homework13 {
    public static void main(String[] args) {
        System.out.println("..........TASK1............");
        for (int i = 1; i <= 10; i++) {
            if (i % 10 == 0) System.out.println("FooBar");
            else if (i % 2 == 0) System.out.println("Foo");
            else if (i % 5 == 0) System.out.println("Bar");
            else System.out.println(i);
        }
        System.out.println("..........TASK2............");
        int[] numbers = {0, -4, -7, 0, 5, 10, 45};

        boolean firstPositive = false;
        boolean firstNegative = false;

        for (int number : numbers) {
            if (number < 0 && !firstNegative) {
                firstNegative = true;

                System.out.println(number);
            } else if (number > 0 && !firstPositive) {
                firstPositive = true;
                System.out.println(number);
            }
            if (firstNegative && firstPositive) break;

        }

        System.out.println("..........TASK3............");
        int[] task3 = new int[5];
        int random1 = (int) (Math.random() * 10) + 1;
        for (int i = 0; i < task3.length; i++) {
            task3[i] = random1 = (int) (Math.random() * 10) + 1;
            Arrays.sort(task3);

        }
        System.out.println(Arrays.toString(task3));
        System.out.println(Arrays.binarySearch(task3, 3) >= 0 || Arrays.binarySearch(task3, 2) >= 0);

        System.out.println("..........TASK4............");
        String[] fruit = {"banana", "ORANGE", "apple"};
        boolean hasApple = false;
        for (String fruits : fruit) {
            if (fruits.equalsIgnoreCase("apple")) {
                hasApple = true;
                break;
            }
        }
        System.out.println(hasApple);
        System.out.println("..........TASK5............");
        int[] arr1 = {1, 2, 3,5,6};
        int[] arr2 = {2, 4,5,6,1,10};
        for (int task5 : arr1) {
            for (int i : arr2) {
                if (task5 == i) {
                    System.out.println(task5);
                }
            }
        }

        System.out.println("..........TASK6............");

        String str = "baNana";
        //            012345
        String duplicates = ""; // a

       for(int i=0;i<str.length()-1;i++){
           for(int j=i+1;j<str.length();j++){
            if(str.toLowerCase().charAt(i)==str.toLowerCase().charAt(j)&&
               !duplicates.contains(str.toLowerCase().substring(i,i+1))){
                duplicates+=str.toLowerCase().charAt(i);
                System.out.println(str.charAt(i));
                break;
            }

                }

            }
        }














        }











