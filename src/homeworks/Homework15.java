package homeworks;

import java.util.*;

public class Homework15 {
    public static void main(String[] args) {
        System.out.println("<<<<<<<<<TASK1>>>>>>>>>>");

        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(23);
        numbers.add(67);
        numbers.add(23);
        numbers.add(78);

        System.out.println(numbers.get(3));
        System.out.println(numbers.get(0));
        System.out.println(numbers.get(2));
        System.out.println(numbers);


        System.out.println("<<<<<<<<<TASK2>>>>>>>>>>");
        List<String> str = new ArrayList<>();
        str.add("Blue");
        str.add("Brown");
        str.add("Red");
        str.add("White");
        str.add("Black");
        str.add("Purple");
        System.out.println(str.get(0));
        System.out.println(str.get(3));
        System.out.println(str.get(5));
        System.out.println(str);

        System.out.println("<<<<<<<<<TASK3>>>>>>>>>>");
        List<Integer> numbers3 = new ArrayList<>();
        numbers3.add(23);
        numbers3.add(-34);
        numbers3.add(-56);
        numbers3.add(0);
        numbers3.add(89);
        numbers3.add(100);
        System.out.println(numbers3);
        Collections.sort(numbers3);
        System.out.println("My ArrayList after sort " + numbers3);

        System.out.println("<<<<<<<<<TASK4>>>>>>>>>>");
        List<String> str4 = new ArrayList<>();
        str4.add("Istanbul");
        str4.add("Berlin");
        str4.add("Madrid");
        str4.add("Paris");
        System.out.println(str4);
        Collections.sort(str4);
        System.out.println("My ArrayList after sort " + str4);

        System.out.println("<<<<<<<<<TASK5>>>>>>>>>>");
        List<String> str5 = new ArrayList<>();
        str5.add("Spider Man");
        str5.add("Iron Man");
        str5.add("Black Panter");
        str5.add("Deadpool");
        str5.add("Captain America");
        System.out.println(str5);
        System.out.println(str5.contains("Wolwerine"));

        System.out.println("<<<<<<<<<TASK6>>>>>>>>>>");
        List<String> str6 = new ArrayList<>();
        str6.add("Hulk");
        str6.add("Black Widow");
        str6.add("Captain America");
        str6.add("Iron Man");
        Collections.sort(str6);
        System.out.println(str6);
        System.out.println(str6.contains("Hulk") && str6.contains("Iron Man"));

        System.out.println("<<<<<<<<<TASK7>>>>>>>>>>");
        List<Character> str7 = new ArrayList<>();
        str7.add('A');
        str7.add('x');
        str7.add('$');
        str7.add('%');
        str7.add('9');
        str7.add('*');
        str7.add('+');
        str7.add('F');
        str7.add('G');
        System.out.println(str7);
        for (Character character : str7) {
            System.out.println(character);
        }

        System.out.println("<<<<<<<<<TASK8>>>>>>>>>>");
        List<String> str8 = new ArrayList<>();

        str8.add("Desk");
        str8.add("Laptop");
        str8.add("Mouse");
        str8.add("Monitor");
        str8.add("Mouse-Pad");
        str8.add("Adapter");
        System.out.println(str8);
        Collections.sort(str8);
        System.out.println(str8);

        int count = 0;
        int countL = 0;
        for (String s : str8) {
            if (s.toLowerCase().startsWith("m")) count++;
            if (!(s.toLowerCase().contains("a")) && (!(s.toLowerCase().contains("e")))) countL++;
        }
        System.out.println(count);
        System.out.println(countL);


        System.out.println("<<<<<<<<<TASK9>>>>>>>>>>");
        List<String> kitchenObject = new ArrayList<>();
        kitchenObject.add("Plate");
        kitchenObject.add("spoon");
        kitchenObject.add("fork");
        kitchenObject.add("Knife");
        kitchenObject.add("cup");
        kitchenObject.add("Mixer");
        System.out.println(kitchenObject);
        int countUpper = 0;
        int countLower = 0;
        int countHasP = 0;
        int countStarEnd = 0;
        for (String s : kitchenObject) {
            char c = s.charAt(0);
            if (Character.isUpperCase(c)) countUpper++;
            else countLower++;
            if (s.toLowerCase().contains("p")) countHasP++;
            if (s.toLowerCase().startsWith("p") || s.toLowerCase().endsWith("p")) countStarEnd++;
        }
        System.out.println("Elements starts with Uppercase = " + countUpper);
        System.out.println("Elements starts with Lowercase = " + countLower);
        System.out.println("Elements has p = " + countHasP);
        System.out.println("Elements starting or ending with p = " + countStarEnd);

        System.out.println("<<<<<<<<<TASK10>>>>>>>>>>");


        List<Integer> numbers10 = new ArrayList<>();
        numbers10.add(3);
        numbers10.add(5);
        numbers10.add(7);
        numbers10.add(10);
        numbers10.add(0);
        numbers10.add(20);
        numbers10.add(17);
        numbers10.add(10);
        numbers10.add(23);
        numbers10.add(56);
        numbers10.add(78);
        System.out.println(numbers10);

        int countDiv10 = 0;
        int countEvenGreater15 = 0;
        int countOddLess20 = 0;
        int countLess15Greater50 = 0;
        for (Integer integer : numbers10) {
            if (integer % 10 == 0) countDiv10++;
            if (integer > 15 && integer % 2 == 0) countEvenGreater15++;
            if (integer < 20 && integer % 2 == 1) countOddLess20++;
            if (integer < 15 || integer > 50) countLess15Greater50++;
        }
        System.out.println("Elements that can be divided by 10 = " + countDiv10);
        System.out.println("Elements that are even and greater than 15 = " + countEvenGreater15);
        System.out.println("Elements that are odd and less than 20 = " + countOddLess20);
        System.out.println("Elements that are less than 15 and greater than 50 = " + countLess15Greater50);


    }

}

