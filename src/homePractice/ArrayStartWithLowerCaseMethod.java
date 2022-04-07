package homePractice;

public class ArrayStartWithLowerCaseMethod {
    public static void main(String[] args) {
        String[] groceries = {"Bread", "Cucumber", "apples", "orange", "cookies", "Cake"};
        //SOLUTION FOR EACH LOOP
        int counter=0;
        for(String grocery:groceries){
            char c=grocery.charAt(0);
            if(Character.isLowerCase(c)){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
