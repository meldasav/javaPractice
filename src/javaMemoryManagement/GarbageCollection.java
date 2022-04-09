package javaMemoryManagement;

public class GarbageCollection {



    public static void main(String[] args) {
        Dog dog1=new Dog();
        Dog dog2=new Dog();
        System.out.println("object references before losing reference");
        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog1.equals(dog2));//false
        System.out.println("\n---------object references after losing reference");
        dog1 = dog2; // dog1 is losing reference here and garbage collected

        System.out.println(dog1);
        System.out.println(dog2);
        System.out.println(dog1.equals(dog2));//true




    }
}
