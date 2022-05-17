package oop_principles.class_objects;

public class Phone {

    public Phone(){
        //Default constructor java provide us with no arguments
    }

    public Phone(String color,double price){
        //overloaded constructor with 2 arguments
    }

    public String color;
    public String model;
    public double price;

    //Defining some behaviors of the Phone Objects
    //WHAT Phone DOES
    public void call(){
        System.out.println("Phone calls");
    }
    public void rings(){
        System.out.println("Phone rings");
    }


}
