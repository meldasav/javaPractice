package homePractice;

public class ArrayStartWithLowerCaseLogic {
    public static void main(String[] args) {
        String[] groceries = {"Bread", "Cucumber", "apples", "orange", "cookies", "Cake"};
        //SOLUTION FOR EACH LOOP
        int counter=0;
        for(String grocery:groceries){
            char c=grocery.charAt(0);
            int i=c;//Casting char to int implicit casting decimal value of ASCII
            if(c>=97 && c<=122){
                counter++;
            }
        }
        System.out.println(counter);
    }
}
