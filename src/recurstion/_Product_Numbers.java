package recurstion;

public class _Product_Numbers {

    public static int recursiveProduct(int n) {
        if (n > 1) return n * recursiveProduct1(n - 1);
        return 1;
    }

    public static int recursiveProduct2(int n) {
        if (n <= 0) return 0;
        else if (n == 1) return 1;
        return n * recursiveProduct1(n - 1);
    }

    // 2.way
    public static int recursiveProduct1(int n) {
        if (n == 1) return 1;
        return n * recursiveProduct1(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(recursiveProduct(5));
    }
}
