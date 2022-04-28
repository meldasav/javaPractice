package homePractice;

public class CountPrime {
    public static int countPrime(int[] array) {
        int countPrime = 0;
        for (int number : array) {
            if (number > 1 && number % 2 != 0 || number == 2) countPrime++;
        }
        return countPrime;

    }
}