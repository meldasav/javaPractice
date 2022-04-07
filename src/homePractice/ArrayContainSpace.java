package homePractice;

import methods.FindSpaceInStringMethod;

import java.util.Arrays;

public class ArrayContainSpace {
    public static void main(String[] args) {
        String[] kitchenItems = {"knife", "wooden spoon", "plates", "cups", "fork"};
        for (int i = 0; i < kitchenItems.length; i++) {
            if (kitchenItems[i].trim().contains(" ")) {
                System.out.println(kitchenItems[i]);//print if the word has more word than one //output wooden spoon it has two words
            }

        }
        String[] colors = {"pink", "purple", "green", "yellow  jacket", "wooden spoon"};
        // int counter=0;
        for (int i = 0; i < colors.length; i++) {
            if (colors[i].indexOf(' ') >= 0) {
                // counter++;
                System.out.println(colors[i]);
            }
        }


    }


}

