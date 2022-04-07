package homeworks;

import java.util.*;

public class Homework14OzdenSolution {
    public static void main(String[] args) {
        System.out.println("\n------TASK-1------\n");

        int[] numbers = {-4, 0, -7, 0, 5, 10, 45, 45};

        boolean isFirstDuplicatedNumberFound = false;
        int firsDuplicatedNumber = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (!isFirstDuplicatedNumberFound && numbers[i] == numbers[j]) {
                    firsDuplicatedNumber = numbers[i];
                    isFirstDuplicatedNumberFound = true;
                    System.out.println(firsDuplicatedNumber);
                    break;
                }
            }
        }
        if (!isFirstDuplicatedNumberFound) System.out.println("There is no duplicates");

                System.out.println("\n------TASK-2------\n");

                String[] words = {"Z", "abc", "z", "123", "#","abc"};

                boolean isFirstDuplicatedWordFound = false;
                String firstDuplicatedWord = "";

                for (int i = 0; i < words.length; i++) {
                    for (int j = i + 1; j < words.length; j++) {
                        if (words[i].equalsIgnoreCase(words[j])) {
                            firstDuplicatedWord = words[i];
                            isFirstDuplicatedWordFound = true;
                            System.out.println(firstDuplicatedWord);
                        }
                    }
                    if (isFirstDuplicatedWordFound) break;
                }
                if (!isFirstDuplicatedWordFound) System.out.println("There is no duplicates");

                System.out.println("\n------TASK-3------\n");

                int[] numS = {1, 2, 5, 0, 7, 7, 2};
                boolean hasDuplicatedNumber = false;
                List<Integer> duplicatedNumbers = new ArrayList<>();

                for (int i = 0; i < numS.length; i++) {
                    for (int j = i + 1; j < numS.length; j++) {
                        if (!duplicatedNumbers.contains(numS[i]) && numS[i] == numS[j]) duplicatedNumbers.add(numS[i]);
                    }
                }
                if (duplicatedNumbers.size() == 0) System.out.println("There is no duplicates");
                else {
                    for (int i = 0; i < duplicatedNumbers.size(); i++) {
                        System.out.println(duplicatedNumbers.get(i));
                    }
                }


                System.out.println("\n------TASK-4------\n");

                String[] wordsT4 = {"A", "foo", "12", "Foo", "bar", "a", "a", "java"};
                List<String> duplicatedWords = new ArrayList<>();

                for (int i = 0; i < wordsT4.length; i++) {
                    for (int j = i + 1; j < wordsT4.length; j++) {
                        if (!duplicatedWords.contains(wordsT4[i]) && wordsT4[i].equalsIgnoreCase(wordsT4[j]))
                            duplicatedWords.add(wordsT4[i]);

                    }
                }
                if (duplicatedWords.size() == 0) System.out.println("There is no duplicates");
                else {
                    for (int i = 0; i < duplicatedWords.size(); i++) {
                        for (int j = i + 1; j < duplicatedWords.size(); j++) {
                            if (!duplicatedWords.get(i).equalsIgnoreCase(duplicatedWords.get(j)))
                                System.out.println(duplicatedWords.get(i));
                        }
                    }
                }
                System.out.println("\n------TASK-5------\n");

                String[] wordsT5 = {"abc", "foo", "bar"};
                List<String> reversed = new ArrayList<>();

                for (int i = wordsT5.length - 1; i >= 0; i--) {
                    reversed.add(wordsT5[i]);
                }
                Object[] reservedArray = reversed.toArray();
                System.out.println(Arrays.toString(reservedArray));

                System.out.println("\n------TASK-6------\n");

                String str = "Java is fun";
                String[] strT6 = str.split(" ");
                String reservedWord = "";

                for (String s : strT6) {
                    for (int j = s.length() - 1; j >= 0; j--) {
                        reservedWord += s.charAt(j);
                    }
                    reservedWord += " ";
                }
                System.out.println(reservedWord);

            }
        }

