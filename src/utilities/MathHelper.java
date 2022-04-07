package utilities;

public class MathHelper {
    public static int maxOfThree(int num1, int num2, int num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static double maxOfThree(double num1, double num2, double num3) {
        return Math.max(num1, Math.max(num2, num3));
    }

    public static byte minOfThree(byte num1, byte num2, byte num3) {
        return (byte) Math.min(num1, Math.min(num2, num3));
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;

    }

    public static boolean isOdd(int number) {
        return number % 2 != 0;
    }

    public static boolean isPositive(int number) {
        return number > 0;
    }

    public static boolean isNegative(int number) {
        return number < 0;
    }

    public static boolean isZero(int number) {
        return number == 0;
    }

    public static int maxOf5(int a, int b, int c, int d, int e) {
        return Math.max(Math.max(Math.max(a, b), Math.max(c, d)), e);
    }

    public static int minOf5(int a, int b, int c, int d, int e) {
        return Math.min(Math.min(Math.min(a, b), Math.min(c, d)), e);
    }

    public static boolean numberNegative(int a) {
        return a < 0;
    }
    public static boolean numberZero(int a) {
        return a==0;
    }
    }
