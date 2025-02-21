package Leetcode;

import java.util.Arrays;

public class Two_Sum_II {
    public int[] twoSum(int[] nums, int target) {
        int start = 0;                // Pointer at the beginning of the array
        int end = nums.length - 1;    // Pointer at the end of the array
        int result[] = new int[2];    // Array to store the result (indices)

        while (start < end) {         // Continue until the pointers meet
            int sum = nums[start] + nums[end];  // Calculate the sum of two numbers

            if (sum == target) {      // If sum equals target, return indices
                result[0] = start + 1;  // Convert 0-based index to 1-based
                result[1] = end + 1;
                break;                 // Exit the loop once the pair is found
            } else if (sum < target) { // If sum is less than target, increase start pointer
                start++;
            } else {                   // If sum is greater than target, decrease end pointer
                end--;
            }
        }
        return result; // Return the found indices
    }

    // Main method for testing
    public static void main(String[] args) {
        Two_Sum_II obj = new Two_Sum_II();

        int[] nums = {2, 7, 11, 15}; // Sorted array input
        int target = 26;              // Target sum

        int[] result = obj.twoSum(nums, target);
        System.out.println(Arrays.toString(result)); // Expected output: [1, 2]
    }
}
