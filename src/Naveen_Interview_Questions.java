import java.util.*;

public class Naveen_Interview_Questions {
    public static void main(String[] args) {
        getDigitCount(100);
        //TODO Print an Integer (Entered by User)
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a number");
        int number = scan.nextInt();
        System.out.println("You entered : " + number);

        //TODO ADD TWO INTEGER

        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println(sum);

        //TODO FLOATING multiplication

        float f1 = 2.4f;
        float f2 = 3.5f;
        System.out.println("The product is " + (f1 * f2));

        //TODO ASCII CHAR

        char c = 'a';
        System.out.println((int) c);

        //TODO Division & Reminder
        int number1 = 30;
        int number2 = 4;
        int quotient = number1 / number2;
        int reminder = number1 % number2;
        System.out.println(quotient);
        System.out.println(reminder);

        //TODO SWAP NUMBER

        int n1 = 10;
        int n2 = 20;
        int temp;
        temp = n1;
        n1 = n2;
        n2 = temp;

        System.out.println(n1);
        System.out.println(n2);

        //TODO CHECK NUMBER IS EVEN OR ODD

        System.out.println("Please enter a number");
        int num1 = scan.nextInt();
        if (num1 % 2 == 0) System.out.println("Number is even");
        else System.out.println("Number is odd");

        //TODO CHECK HAS VOWEL OR CONSONANT
        char ch = 'T';
        String str = "aeoiAEOUI";
        if (str.contains(ch + "")) System.out.println("is vowel");
        else System.out.println("is not vowel");

        // 2.way
        boolean isVowel = false;
        for (int i = 0; i < str.length(); i++) {
            if (ch == str.charAt(i)) {
                isVowel = true;
                break;
            }
        }
        if (isVowel) System.out.println("vowel found");
        else System.out.println("vowel is not found");

        //TODO LARGEST 3 NUMBER
        int x = 600;
        int y = 500;
        int z = 300;

        int biggest = Math.max(x, Math.max(y, z));
        System.out.println(biggest);

        // 2.way
        int[] numbers = {x, y, z};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length - 1]);

        // 3.way
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(x);
        treeSet.add(y);
        treeSet.add(z);
        System.out.println(treeSet.last());

        //4.way
        if (x > y && x > z) System.out.println(x);
        else if (y > x && y > z) System.out.println(y);
        else System.out.println(z);

        //5.way
        ArrayList<Integer> list = new ArrayList<>();
        list.add(x);
        list.add(y);
        list.add(z);
        Collections.sort(list);
        System.out.println(list.get(list.size() - 1));

        //TODO REMOVE WHITE SPACE
        String str1 = "        This  is  my  java  code ";
        StringBuilder sb = new StringBuilder();
        for (String word : str1.split(" ")) {
            if (!word.isEmpty()) sb.append(word).append(" ");
        }
        System.out.println(sb);
    }

    //https://www.youtube.com/watch?v=KRMhsl80Xag&list=PLFGoYjJG_fqqyIj2ht0aHMx_HnGX3ZFEx&index=111
    public static void getDigitCount(long number) {
        HashMap<Long, Integer> map = new HashMap<>();

        while (number != 0){
            long lastDigit = number % 10;
        if (map.containsKey(lastDigit)) {
            map.put(lastDigit, map.get(lastDigit) + 1);
        } else {
            map.put(lastDigit, 1);
        }
            number = number / 10;
    }
            for (Long key : map.keySet()) {
                System.out.println(key + ":" + map.get(key));
            }
        }
    }

