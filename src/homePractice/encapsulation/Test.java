package homePractice.encapsulation;

public class Test {
    public static void main(String[] args) {
        Person person1=new Person();
        person1.setName("john doe");
        person1.setAge(150);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.toString());
        person1.info();
        person1.getGender("male");

    }



}
