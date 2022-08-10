package HomeworkRecap.methods;

public class Method_Average_Min_Max {
    public static void main(String[] args) {
        System.out.println(averageOfEdges(-2, -2, 10));
    }

    /**
     * -Create a method called averageOfEdges()
     * -This method will take three int arguments and it will return
     * average of min and max numbers
     */
    public static int averageOfEdges(int a, int b, int c) {
        int max = Math.max(a, Math.max(b, c));
        int min = Math.min(a, Math.min(b, c));
        return (max + min) / 2;
    }
}
