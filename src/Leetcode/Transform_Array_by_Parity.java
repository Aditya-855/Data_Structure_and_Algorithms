package Leetcode;

import java.util.Arrays;

public class Transform_Array_by_Parity {
    public int[] transformArray(int[] nums) {
        int n = nums.length; // Get the length of the array

        for (int i = 0; i < n; i++) {
            // If the number is even, change it to 0; if odd, change it to 1
            if (nums[i] % 2 == 0) {
                nums[i] = 0;
            } else {
                nums[i] = 1;
            }

            // Sorting the array in every iteration (inefficient)
            Arrays.sort(nums);
        }
        return nums; // Return the transformed and sorted array
    }

    // Main method to test the function
    public static void main(String[] args) {
        Transform_Array_by_Parity sol = new Transform_Array_by_Parity(); // Create an instance of the Solution class

        // Test cases
        int[] test1 = {5, 2, 9, 4, 7};
        int[] test2 = {10, 15, 22, 33, 40};

        // Printing the results
        System.out.println("Transformed Array (Test 1): " + Arrays.toString(sol.transformArray(test1)));
        System.out.println("Transformed Array (Test 2): " + Arrays.toString(sol.transformArray(test2)));
    }
}
