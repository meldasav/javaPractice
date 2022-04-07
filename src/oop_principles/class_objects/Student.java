package oop_principles.class_objects;

public class Student {


    //Please call default constructor here

    public Student() {
    }
    //Define public instance variables of Student class as below
    //firstName, lastName, age, dateOfBirth, gender, address
    //height, weight, email, id

    public String firstName;
    public String lastName;
    public int age;
    public String dateOfBirth;
    public String gender;
    public String address;
    public double weight;
    public double height;
    public String email;
    public int id;

    //Define Student behaviors - functions
    //study, eat, sleep

    public void study() {
        System.out.println("students study");
    }

    public void eat() {
        System.out.println("students eat");
    }

    public void sleep() {
        System.out.println("students sleep");
    }
    //Override toString() method from Object class
    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", dateOfBirth='" + dateOfBirth + '\'' +
                ", id=" + id +
                '}';
    }
}


