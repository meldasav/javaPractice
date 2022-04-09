package javaMemoryManagement;

public class GarbageCollection2 {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog);

        dog = null;
        System.gc();

    }
}