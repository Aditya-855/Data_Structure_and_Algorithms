package Leetcode;

import java.util.Arrays;

public class Partition_Array_According_to_Given_Pivot {
    public int[] pivotArray(int[] nums, int pivot) {
        int n = nums.length;
        int[] result = new int[n];  // Create a result array of the same size
        int leftidx = 0;  // Index for elements smaller than pivot
        int rightidx = n - 1;  // Index for elements greater than pivot

        // Loop runs from both ends
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            if (nums[i] < pivot) { // If current element is smaller than pivot
                result[leftidx] = nums[i];
                leftidx++;  // Move left index forward
            }
            if (nums[j] > pivot) { // If current element from right is greater than pivot
                result[rightidx] = nums[j];
                rightidx--;  // Move right index backward
            }
        }

        // Fill the middle section with the pivot value
        while (leftidx <= rightidx) {
            result[leftidx] = pivot;
            leftidx++;
        }
        return result; // Return the rearranged array
    }
    // Main method to test the function
    public static void main(String[] args) {
        Partition_Array_According_to_Given_Pivot sol = new Partition_Array_According_to_Given_Pivot();
        int[] nums = {9, 12, 5, 10, 14, 3, 10};
        int pivot = 10;

        int[] result = sol.pivotArray(nums, pivot);

        System.out.println("Rearranged Array: " + Arrays.toString(result));
    }
}
