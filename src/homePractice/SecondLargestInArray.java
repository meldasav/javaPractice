package homePractice;

public class SecondLargestInArray {
    public static void main(String[] args) {

        int[] arr = {50, 6,60,70,80,90,9,150,2,35};
        int largest = arr[0];
        int secondLargest = arr[0];

        System.out.println("The given array is:" );
        for (int j : arr) {
            System.out.print(j + "\t");
        }
        for (int j : arr) {

            if (j > largest) {
                secondLargest = largest;
                largest = j;

            } else if (j > secondLargest) {
                secondLargest = j;

            }
        }

        System.out.println("\nSecond largest number is:" + secondLargest);

    }
}
