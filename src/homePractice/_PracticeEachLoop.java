package homePractice;

public class _PracticeEachLoop {
    public static void main(String[] args) {
        String[] students = {"Alex", "Tom", "John", "James", "Jordan", "Lionel", "Adam"};
        boolean check = true;
        for (int i = 0; i < students.length; i++) {
            if (students[i].equals("Jennifer")) {
                System.out.println("true");
                check = false;
                break;
            }
        }
        if(check){
            System.out.println(false);
        }

    }
}