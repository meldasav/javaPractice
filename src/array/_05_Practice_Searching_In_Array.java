package array;

public class _05_Practice_Searching_In_Array {
    public static void main(String[] args) {
        String[] objects = {"Remote", " Mickey Mouse", " Mickey Mouse", "Keyboard", "ipad"};
        boolean isOneOfTheElementIsBoard = false;
        for (String object : objects) {
            if (object.equals("board")) {
                isOneOfTheElementIsBoard = true;
                break;
            }

        }
        System.out.println(isOneOfTheElementIsBoard);
    }
}