package oop_principles.class_objects;

import java.util.ArrayList;
import java.util.List;

public class Animal {

    //default constructor
    public Animal() {

    }

    public Animal(String name, int age, String color, boolean isHerbivore) {

        this.name = name;
        this.age = age;
        this.color = color;
        this.isHerbivore = true;
    }


    //Custom constructor that takes 6 arguments - name, color, age, isHerbivore, isCarnivore, isOmnivore

    public Animal(String name, String color, int age, boolean isCarnivore, boolean isHerbivore, boolean isOmnivore) {
        //I should assign these local variables into instance variables
        this.name = name;
        this.age = age;
        this.color = color;
        this.isCarnivore = isCarnivore;
        this.isHerbivore = isHerbivore;
        this.isOmnivore = isOmnivore;
    }


    //Fields of an Animal instance
    public static int noOfAnimals = 0;
    public static final boolean hasEyes = true;
    public String name;
    public int age;
    public String color;
    public boolean isCarnivore;
    public boolean isHerbivore;
    public boolean isOmnivore;

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", age=" + age +
                ", isCarnivore=" + isCarnivore +
                ", isHerbivore=" + isHerbivore +
                ", isOmnivore=" + isOmnivore +
                '}';
    }

    //Testing Animal
    public static void main(String[] args) {

        /*
        Create an animal object called a1 and define its information as below
        Cow
        3
        Black
        Herbivore
         */
        Animal a1 = new Animal("Cow", "Black", 3, false, true, false);
        System.out.println(a1);

        Animal a2 = new Animal("Cat", "Gray", 1, false, false, true);
        System.out.println(a2);

        Animal a3 = new Animal("Parrot", "White", 2, false, true, false);
        System.out.println(a3);
        Animal a4 = new Animal("Lion", "Beige", 4, true, false, false);
        System.out.println(a4);
        List<Animal> animals = new ArrayList<>();
        animals.add(a1);
        animals.add(a2);
        animals.add(a3);
        animals.add(a4);
        int countHerbivore = 0;
        int countCarnivore = 0;
        int countOmnivore = 0;
        for (Animal animal : animals) {
            if (animal.isHerbivore) countHerbivore++;
            else if (animal.isOmnivore) countOmnivore++;
            else countHerbivore++;
        }
        System.out.println(countHerbivore);
        System.out.println(countOmnivore);
        System.out.println(countCarnivore);

        // 2.way easy way


        int herbivoreCount = (int) animals.stream().filter(animal -> animal.isHerbivore).count();
        int carnivoreCount = (int) animals.stream().filter(animal -> animal.isCarnivore).count();
        int omnivoreCount = (int) animals.stream().filter(animal -> animal.isOmnivore).count();
        System.out.println(herbivoreCount);


    }

}


