package enums;

import java.time.Month;

public class Traversing {
    public static void main(String[] args) {
        for (Day day: Day.values()) {
            System.out.println(day);
        }

        for (Constants.Month Month :Constants.Month.values()){
            System.out.println(Month);
        }
    }

}
