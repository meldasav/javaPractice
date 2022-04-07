package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AppleTest {
    public static void main(String[] args) {
        Apple apple1 = new Apple();
        apple1.color="RED";
        apple1.taste="sweet";
        apple1.price=0.99;

        System.out.println(apple1.color);
        System.out.println(apple1.taste);
        System.out.println(apple1.price);
        System.out.println(apple1);


        // Apple{color='Red', taste='Sweet', price='0.99'}
        System.out.println(apple1);

        Apple apple2 = new Apple();
        apple2.color = "Green";
        apple2.taste = "Sour";
        apple2.price = 1.29;

        System.out.println(apple2);


        Apple apple3 = new Apple();
        apple2.taste="sour";
        apple2.color="green";
        System.out.println(apple2.color);
        System.out.println(apple2.taste);
        //apple1, apple2, apple3

        Apple[] myApples = {apple1, apple2, apple3};
        System.out.println(Arrays.toString(myApples));

        ArrayList<Apple> myAppleList = new ArrayList<>(Arrays.asList(myApples));
        System.out.println(myAppleList);

        for (Apple apple : myAppleList) {
            System.out.println("My Apple = " + apple);
        }

        for (Apple apple : myAppleList) {
            System.out.println(apple.color);
            System.out.println(apple.taste);
            System.out.println(apple.price);
        }

    }
}
