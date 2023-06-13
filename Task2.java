package org.example.Homework.HW2;

public class Task2 {
    public static boolean isIncreasingSequence(int[] nums) {
        int n = nums.length;

        for (int i = 1; i < n; i++) {
            if (nums[i] <= nums[i - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5, 3};
        boolean isIncreasing = isIncreasingSequence(nums);
        System.out.println("Последовательность возрастающая? - " + isIncreasing);
    }
}
