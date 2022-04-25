package array;

public class Count_The_Occurrences_In_Array {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 2, 1, 3, 4, 3, 2, 6};
        StringBuilder str = new StringBuilder();
        for (int number : numbers) {
            int counter = 0;
            if (!str.toString().contains(number + " ")) {
                str.append(number);
                for (int i : numbers) {
                if (number == i) counter++;
                }
            }

            System.out.println("There are " + counter + "occurrences of" + number + " in the array");
        }
    }
}
