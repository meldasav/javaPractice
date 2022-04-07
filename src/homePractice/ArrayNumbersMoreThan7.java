package homePractice;

public class ArrayNumbersMoreThan7 {
    public static void main(String[] args) {
        int[] numbers = {-3, -7, 0, 2, 0, 7, 7, 10, 2, 15};
        //Numbers that are more than 7
        int counter = 0;
        for (int number : numbers) {
            if (number > 7) {
                counter++;
            }
        }
        System.out.println(counter);
        for (int number : numbers) {
            if (number % 5 == 0) {
                counter++;
            }
        }
        System.out.println(counter);
        for (int number : numbers) {
            if (number % 2 == 0 && !(number % 3 == 0)) {
                counter++;
            }
        }
        System.out.println(counter);

        boolean is10 = false;
        for (int number : numbers) {
            if (number==10) {
                is10 = true;
                break;
            }
        }if(is10)
        System.out.println(true);


        }
        }

