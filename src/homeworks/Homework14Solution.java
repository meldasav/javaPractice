package homeworks;

public class Homework14Solution {
    public static void main(String[] args) {
        //task3
        //Find the all duplicates in array
        //deniz solution

        //TASK2
        boolean isDuplicateFound=false;
        String[] words={"Z","abc","z","123","#","abc"};
        for (int i = 0; i < words.length-1; i++) {
            for (int j = i+1; j < words.length ; j++) {
                if(words[i].equalsIgnoreCase(words[j])){
                    System.out.println(words[i]);
                    isDuplicateFound=true;
                    break;
                }
            }
            if(isDuplicateFound)break;
        }
        if(!isDuplicateFound) System.out.println("There is no duplicate");






        int[] number = {1, 2, 5, 0, 7};

        boolean allDuplicates = false;
        int temp1 = 0;
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = i + 1; j < number.length; j++) {
                if (number[i] == number[j]) {
                    System.out.println(number[i]);
                    allDuplicates = true;
                    temp1 += 1;
                    break;
                }
            }
            if (temp1 > 1) {
                break;
            }
        }
        if (!allDuplicates) {
            System.out.println("There is no duplicate");
        }
        //task 6
        String words3 = "Java is fun";
        String[] words2 = words3.split(" ");
        String reversedString = "";
        for (int i = 0; i < words2.length; i++) {
            String word = words2[i];
            String reverseWord = "";
            for (int j = word.length() - 1; j >= 0; j--) {
                reverseWord = reverseWord + word.charAt(j);
            }
            reversedString = reversedString + reverseWord + " ";
        }
        System.out.println(reversedString);



       //  NAIM'S SOLUTION:
String str = "Today is a fun day";
String[] word = str.split(" ");
String fullReverse = "";

for (String s : word) {
    String reversedWord = "";
    for (int i = s.length() - 1; i >= 0; i--) {
        reversedWord += s.charAt(i);
    }
    fullReverse += reversedWord + " ";
}
System.out.println(fullReverse.trim());

         //kerem solution

        String string = "Java is fun";
        String[] opposite = string.split(" ");
        for (int i = 0; i < opposite.length; i++){
            for (int j = opposite[i].length() - 1; j >= 0; j--) {
                System.out.print(opposite[i].charAt(j));
            }
            System.out.print(" ");
        }

        // Andrei Solution
        String str1 = "Today is a fun day";
        String s1 = "";
        for (int i = str1.length()-1; i >= 0 ; i--) {
            s1+= str1.charAt(i);
        }
        String[] s2 = s1.split(" ");
        String b = "";
        for (int i = s2.length-1; i >=0 ; i--) {
            b+= s2[i]+ " ";
        }
        System.out.println(b.substring(0, b.length()-1));


    }
}
