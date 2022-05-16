package homeworks.homeworks_fixed;

public class _Homework18_Salih_Solution {
    public static void main(String[] args) {
        int[] numS = {7, 14, 11, 23, 17, -1, -4};//4
        System.out.println(countPrimes(numS));
    }

    public static int countPrimes(int[] arr) {
        int primes = 0;
        for (int num : arr) {
            //if it less than 2 skip that number
            if (num < 2) continue;
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {//every number divided bye 1 that's why we are starting 2
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) primes++;
        }
        return primes;
    }


    }

