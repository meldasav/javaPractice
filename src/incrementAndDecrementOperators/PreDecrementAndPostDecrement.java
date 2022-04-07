package incrementAndDecrementOperators;

public class PreDecrementAndPostDecrement {
    public static void main(String[] args) {
        int i=5;
        int age=10*(i++);
        System.out.println(age);
       int age1 =10*(++i);
        System.out.println(age1);
    }
}
