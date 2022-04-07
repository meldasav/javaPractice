package homePractice;

import utilities.MathHelper;
import utilities.RandomNumberGenerator;

import java.util.Arrays;

public class ArrayRandom {
    public static void main(String[] args) {
        int[] ages = new int[50];
        int random = (int) (Math.random() * 101);

        for (int i = 0; i < ages.length; i++) {
            ages[i] = random = (int) (Math.random() * 101);
        }
        System.out.println(Arrays.toString(ages));
    }
}
