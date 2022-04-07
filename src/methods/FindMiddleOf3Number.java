package methods;

public class FindMiddleOf3Number {
    public static void main(String[] args) {

        System.out.println(countSpecificElement(new int[]{}, 7)); // 0
        System.out.println(countSpecificElement(new int[]{-4, -2, 0, 2, 4}, 7)); // 0
        System.out.println(countSpecificElement(new int[]{7, -3, -7, 0, 2, 0, 7, 10, 2, 1}, 7));



    }

    public static int countSpecificElement(int[] arr, int number) {
        int count = 0;
        for (int element : arr) {
            if(element == number) count++;
        }
        return count;
    }








}


