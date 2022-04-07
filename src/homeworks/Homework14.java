package homeworks;

import java.util.*;

public class Homework14 {
    public static void main(String[] args) {

        System.out.println("............TASK1..............");
       // int[] numbers = {3, 4, 3, 3, 5, 5, 6, 6, 7};vita solution
        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};
        //find the first duplicated element
        boolean isDuplic = false;
        int attempt = 0;
        for (int i = 0; i < numbers.length-1; i++){
            for (int j = i + 1; j < numbers.length; j++) {
                if(numbers[i] == numbers[j]){
                    attempt +=1;
                    System.out.println(numbers[i]);
                    isDuplic = true;
                    break;
                }
            }
            if(attempt > 0) break;
        }
        if(!isDuplic) System.out.println("There is no duplicates");


        System.out.println("............TASK2..............");
        String[] words = {"Z", "abc", "z", "123", "#","abc"};
        boolean isDuplicate = false;
        String firstDuplicatedWord="";
        for (int i = 0; i < words.length; i++) {
            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equalsIgnoreCase(words[j])) {
                    firstDuplicatedWord=words[i];
                    isDuplicate = true;
                    System.out.println(firstDuplicatedWord);
                }
            }
            if(isDuplicate)break;
        }
        if (!isDuplicate) {
            System.out.println("There is no duplicates");
        }

        System.out.println("............TASK3..............");
       int[] task3 = {0, -4, -7, 0, 5, 10, 45, -7, 0};
       // int[] task3 = {1, 2, 5, 0, 7};
        String s="";
        for (int i = 0; i < task3.length - 1; i++) {
            for (int j = i + 1; j < task3.length ; j++) {
                if (task3[i] == task3[j] && !s.contains(task3[i]+"")) {
                    s+=task3[i] + "\n";

                }
            }
        }
       System.out.println((s.isEmpty())? "There is no duplicates" : s);



        System.out.println("............TASK4..............");
        String[] task4 ={"A", "foo", "12" , "Foo", "bar", "a","a","java"};
       // String[] task4 = {"python", "foo", "bar", "java", "123"};
          ArrayList<String> dup=new ArrayList<>();
        for (int i = 0; i < task4.length ; i++) {
            for (int j = i + 1; j < task4.length ; j++) {
                if (task4[i].equalsIgnoreCase(task4[j]) && !dup.contains(task4[i].toLowerCase())) {
                    dup.add(task4[i].toLowerCase());
                   System.out.println(task4[i]);
                    break;
                }

            }
        }

        if (dup.isEmpty()) {
            System.out.println("There is no duplicates");
        }


        System.out.println("............TASK5..............");

        //  String[] task5 = {"abc", "foo", "bar"};
        String[] task5 = {"java", "python", "ruby"};//[ruby, python, java]
        String arr = task5[0];
        task5[0] = task5[2];
        task5[2] = arr;
        System.out.println(Arrays.toString(task5));
        //second way
        String[] reversedWords2= new String[task5.length];
//        for (int i = 0,j=task5.length-1; i < task5.length; i++,j--) {
//            reversedWords2[i]=task5[j];
//
//        }
//        System.out.println(Arrays.toString(reversedWords2));
        //2.way
        for (int i = 0; i < task5.length; i++) {
            reversedWords2[i]=task5[task5.length-1-i];
        }
        System.out.println(Arrays.toString(task5));

        System.out.println("............TASK6..............");
      //  String str = "Java is fun";
        String str = "Today is a fun day";
        String[] task6 = str.split(" ");//splitting into a words
        String reversed ="";
        for (String task : task6) {//storing each variable into task
            String reversedW ="";
            for (int i = task.length() - 1; i >= 0; i--) {//reverse string
                reversedW +=task.charAt(i);
            }
            reversed +=reversedW + " ";//avaJ is nuf // yadoT si a nuf yad
        }
        System.out.println(reversed);


    }
}