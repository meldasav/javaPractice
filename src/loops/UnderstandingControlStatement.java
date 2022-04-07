package loops;

import utilities.RandomNumberGenerator;

public class UnderstandingControlStatement {
    public static void main(String[] args) {

//        for (int i = 1; i <= 25; i++) {
//            if (!(i % 10 == 0)) {
//                System.out.println(i);
//            }
//
//        }
//
//        for (int i = 1; i <= 25; i++) {
//            if ((i % 10 == 0)) continue;
//            else System.out.println(i);
//            if(i==15) break;
//        }

        String task4 = "";

        if (task4.length() < 2) {
            System.out.println("Length is less than 2");
        } else {
            String first2 = task4.substring(0, 2);
            String last2 = task4.substring(task4.length() - 2);
            System.out.println(first2.equals(last2));
        }
    }
}
