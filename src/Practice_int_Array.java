import java.util.Arrays;

public class Practice_int_Array {
    public static void main(String[] args) {
        int[] numbers = {-3, -7, 0, 7, 7, 10, 2, 15};
        System.out.println("Array not sorted = " + Arrays.toString(numbers));
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);

        }
        int contE = 0;
        int contO = 0;


        for (int even : numbers) {
            if (even%2==0) {
                contE++;
            } else  {
                contO++;

            }
        }
        System.out.println(contE);
        System.out.println(contO);



    }
}