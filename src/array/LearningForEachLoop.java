package array;

import java.util.Arrays;

public class LearningForEachLoop {
    public static void main(String[] args) {
        char[] chars={'A',' ','#','T','6','9'};
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
        //2nd way
        for(char element:chars){
            System.out.println("element" + element);
        }

    }
}
