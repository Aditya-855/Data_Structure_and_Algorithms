package Leetcode;

import java.util.Arrays;

public class Third_Maximum_Number {
    public int thirdMax(int[] nums) {
        Arrays.sort(nums); // Step 1: Sort the array in ascending order

        int n = nums.length; // Step 2: Get the size of the array
        int count = 1;       // Step 3: Initialize a counter to track distinct maximum values

        // Step 4: Traverse the sorted array from right to left (starting from the largest number)
        for (int i = n - 1; i >= 1; i--) {
            if (nums[i] != nums[i - 1]) {  // Step 5: Check if current element is distinct
                count++;  // Step 6: Increase the distinct count

                if (count == 3) {  // Step 7: If we found the 3rd distinct maximum, return it
                    return nums[i - 1];
                }
            }
        }

        // Step 8: If there is no third distinct maximum, return the largest number
        return nums[n - 1];
    }

    // Main method to test the function
    public static void main(String[] args) {
        Third_Maximum_Number solution = new Third_Maximum_Number(); // Create an instance of Solution

        // Test cases
        int[] nums1 = {3, 2, 1};
        System.out.println("Third Maximum: " + solution.thirdMax(nums1)); // Expected Output: 1

        int[] nums2 = {1, 2};
        System.out.println("Third Maximum: " + solution.thirdMax(nums2)); // Expected Output: 2

        int[] nums3 = {2, 2, 3, 1};
        System.out.println("Third Maximum: " + solution.thirdMax(nums3)); // Expected Output: 1

        int[] nums4 = {1, 1, 2};
        System.out.println("Third Maximum: " + solution.thirdMax(nums4)); // Expected Output: 2

        int[] nums5 = {5, 2, 2, 4, 1};
        System.out.println("Third Maximum: " + solution.thirdMax(nums5)); // Expected Output: 2
    }
}
