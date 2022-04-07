package homePractice;

public class ArrayStartWithUpperCaseMethod {
    public static void main(String[] args) {
        String[] groceries = {"Bread", "Cucumber", "apples", "orange", "cookies", "Cake"};
        int counter = 0;
        for (String grocery : groceries) {
            char c = grocery.charAt(0);
            if (Character.isUpperCase(c)) {
                counter++;
            }
        }
        System.out.println("The word starts with uppercase  : " + counter);
    }
}