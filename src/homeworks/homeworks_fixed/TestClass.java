package homeworks.homeworks_fixed;

import java.util.ArrayList;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
         /*
        Write a code that asks user to if they would like join your classes
        If the answer is "Yes" from user,then ask user information; firstName, lastName, age, gender, class to join
        ***If user is age is not more than 20, do not allow them to join
        ***If user wants to join any other class except Math and Science, do not allow them to join
        REMEMBER - checkAge and checkClassName methods may throw exceptions. You have to handle them
        Keep asking users the question they would to like join until you have got 3 students overall
        Create MathStudent or ScienceStudent objects based on user's answer for the class they want to join
        Print a "Congratulations! You are registered for {className} class."
        Store all these 3 objects in a collection and print them
        EXPECTED OUTPUT OF THE PROGRAM:
        Print information of all 3 students
        Print how many students are MathStudent with message -> "Math students = {numberOfMathStudents}"
        Print how many students are ScienceStudent with message -> "Science students = {numberOfScienceStudents}"
         */
        int countMathClass = 0;
        int countScienceClass = 0;
        ArrayList<Student> students = new ArrayList<>();
        do {
            Scanner scanner = new Scanner(System.in);
            System.out.println(UserQuestions.askToJoin);
            String join = scanner.next();
            if (join.equalsIgnoreCase("y")) {
                System.out.println(UserQuestions.askFirstName);
                String name = scanner.next();

                System.out.println(UserQuestions.askLastName);
                String lastName = scanner.nextLine();
                scanner.nextLine();
                System.out.println(UserQuestions.askAge);
                int age = scanner.nextInt();
                try {
                    Permission.checkAge(age);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
                System.out.println(UserQuestions.askGender);
                String gender = scanner.next();

                System.out.println(UserQuestions.askClassName);
                String className = scanner.next();

                try {
                    Permission.checkClassName(className);
                } catch (Exception e) {
                    e.printStackTrace();
                    break;
                }
                if (className.equalsIgnoreCase("Math")) {
                    countMathClass++;

                    System.out.println("Congratulations! You are registered for " + className + "class.");
                    students.add(new MathClass(name, lastName, age, gender, className));
                } else if (className.equalsIgnoreCase("Science")) countScienceClass++;
                System.out.println("Congratulations! You are registered for " + className + "class.");
                students.add(new ScienceStudents(name, lastName, age, gender, className));
            }
        } while (students.size() < 3);
        for (Student student : students) {
            System.out.println(student);
        }
        if (students.size() == 3) {
            System.out.println(" Math student " + countMathClass);
            System.out.println(" Science student " + countScienceClass);
        }
    }

}
