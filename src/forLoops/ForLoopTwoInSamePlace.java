package forLoops;

public class ForLoopTwoInSamePlace {
    public static void main(String[] args) {
        for (int i = 0, j = 0; i < 10 && j < 10; i++, j++) {
            System.out.println("i= " + i + " j= " + j);

        }
    }
}
