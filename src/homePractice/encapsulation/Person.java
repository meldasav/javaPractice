package homePractice.encapsulation;

public class Person {

    private String name;
    private String gender;
    private int age;
    private double height;
    private double weight;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender(String male) {
        return gender;
    }

    public void setGender(String gender) {
        if (gender.equalsIgnoreCase("male") || gender.equalsIgnoreCase("female")) {
            this.gender = gender;
        } else {
            System.out.println("invalid gender");
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 0 && age <= 120) {
            this.age = age;
        } else {
            System.out.println("invalid age");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("invalid height");
        }
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight > 0) {
            this.weight = weight;
        } else {
            System.out.println("invalid weight");
        }
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    public void info() {
        System.out.println("name" + this.name);
        System.out.println("age " + this.age);
        System.out.println("gender " + this.gender);
        System.out.println("weight " + this.weight);
        System.out.println("height " + this.height);
    }

    public static void getHaircut(Person person) {
        if (person.gender.equalsIgnoreCase("male")) {
            System.out.println(person.name + "is getting haircut");
        } else if (person.gender.equalsIgnoreCase("female")) {
            System.out.println(person.name + "is getting haircut at hair salon");
        } else {
            System.out.println("not able to get haircut");
        }
    }

    public static void getMarried(Person p1, Person p2) {
        if (p1.age >= 18 && p2.age >= 18) {
            if (p1.gender.equalsIgnoreCase("male") && p2.gender.equalsIgnoreCase("female")) {
                System.out.println("valid marriage");
            } else if (p1.gender.equalsIgnoreCase("female") && p2.gender.equalsIgnoreCase("male")) {
                System.out.println("valid marriage");
            } else {
                System.out.println("invalid marriage");
            }
        } else {
            System.out.println("too young the get married");
        }
    }
}