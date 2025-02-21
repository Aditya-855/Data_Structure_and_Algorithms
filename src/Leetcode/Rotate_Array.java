package Leetcode;

import java.util.Arrays;

public class Rotate_Array {
        public int[] rotate(int[] nums, int k) {
            int n = nums.length;
            k = k % n;  // Handle cases where k > n (e.g., rotating by more than array length)

            // Step 1: Reverse the entire array
            reverse(nums, 0, n - 1);

            // Step 2: Reverse the first k elements
            reverse(nums, 0, k - 1);

            // Step 3: Reverse the remaining elements
            reverse(nums, k, n - 1);

            return nums;
        }

        // Function to reverse a portion of the array
        public static void reverse(int[] nums, int start, int end) {
            while (start < end) { // Swap elements until start meets end
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }

        // Main method for testing
        public static void main(String[] args) {
            Rotate_Array obj = new Rotate_Array();

            int[] nums = {1, 2, 3, 4, 5, 6, 7};
            int k = 3;

            System.out.println("Original Array: " + Arrays.toString(nums));
            int[] rotatedArray = obj.rotate(nums, k);
            System.out.println("Rotated Array: " + Arrays.toString(rotatedArray));
        }
}
