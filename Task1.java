package org.example.Homework.HW2;

public class Task1 {
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    public static int sumOfPrimes(int[] nums) {
        int sum = 0;

        for (int num : nums) {
            if (isPrime(num)) {
                sum += num;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        int sum = sumOfPrimes(nums);
        System.out.println(sum);
    }
}
