package Leetcode;

import java.util.Arrays;

public class Apply_Operations_to_an_Array {
    public int[] applyOperations(int[] nums) {
        int n = nums.length;

        // Step 1: Modify array by doubling equal adjacent elements
        for (int i = 0; i < n - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                nums[i] = nums[i] * 2; // Double the current element
                nums[i + 1] = 0;       // Set the next element to 0
            }
        }

        // Step 2: Move non-zero elements to the left
        int notZero = 0;
        for (int i = 0; i < n; i++) {
            if (nums[i] != 0) {
                nums[notZero++] = nums[i]; // Place non-zero elements in order
            }
        }

        // Step 3: Fill remaining positions with zeros
        while (notZero < n) {
            nums[notZero++] = 0;
        }

        return nums;
    }

    public static void main(String[] args) {
        Apply_Operations_to_an_Array sol = new Apply_Operations_to_an_Array();

        int[] nums = {2, 2, 0, 4, 4, 8};
        System.out.println("Original Array: " + Arrays.toString(nums));

        int[] result = sol.applyOperations(nums);
        System.out.println("Modified Array: " + Arrays.toString(result));
    }
}
