package Leetcode;

import java.util.*;

public class The_Two_Sneaky_Numbers_of_Digitville {
    public int[] getSneakyNumbers(int[] nums) {
        int n = nums.length;
        int[] result = new int[2]; // Assuming at most 2 duplicates
        int k = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++){
                if (nums[i] == nums[j]){
                    result[k++] = nums[i]; // Store duplicate
                    if (k == 2) return result; // Stop if 2 duplicates are found
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        The_Two_Sneaky_Numbers_of_Digitville solution = new The_Two_Sneaky_Numbers_of_Digitville();

        int[] nums = {4, 3, 2, 7, 8, 2, 3, 1}; // Example input
        int[] result = solution.getSneakyNumbers(nums);

        System.out.println("Sneaky Numbers: " + Arrays.toString(result));
    }
}