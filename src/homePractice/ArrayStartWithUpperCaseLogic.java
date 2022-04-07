package homePractice;

public class ArrayStartWithUpperCaseLogic {
    public static void main(String[] args) {

        String[] groceries = {"Bread", "Cucumber", "apples", "orange", "cookies", "Cake"};
        int count = 0;
        for (String grocery : groceries) {
            char c = grocery.charAt(0);
            int i = c;//store int because decimal value in ASCII
            if (i >= 65 && i <= 90) {
                count++;
            }
        }
        System.out.println("total words start with upperCase : " + count);


    }


    }
