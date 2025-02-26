package Leetcode;

import java.util.Arrays;

public class Maximum_Gap {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0; // If array has less than 2 elements, gap is 0

        Arrays.sort(nums); // Sort the array

        int maxGap = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            int gap = nums[i + 1] - nums[i]; // Difference between consecutive elements
            maxGap = Math.max(maxGap, gap); // Update maxGap if the new gap is larger
        }

        return maxGap;
    }

    public static void main(String[] args) {
        Maximum_Gap solution = new Maximum_Gap();
        int[] nums = {1, 1, 1, 4, 4, 4};
        System.out.println("Maximum Gap: " + solution.maximumGap(nums)); // Output: 3
    }
}

