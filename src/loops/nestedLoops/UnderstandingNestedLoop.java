package loops.nestedLoops;

public class UnderstandingNestedLoop {
    public static void main(String[] args) {
        /**
         * print all the lower and uppercase
         * a
         * b
         * c
         * d
         * uppercase
         * A
         * B
         * C
         * D
         */
        for (int i = 1; i <= 2; i++) {//outer loop will run 2 times
            int start = 97;
            if (i == 1) {
                //First iteration start point 97 end point 122=start+25
                System.out.println("LowerCase Letters");
            } else {
                //second iteration start point =65 end =90
                System.out.println("UpperCase Letters");
                start = 65;//change your start point for second iteration
            }             //97        //122
            for (int j = start; j <= start + 25; j++) {
                System.out.println((char) j);

            }
        }


    }
}
