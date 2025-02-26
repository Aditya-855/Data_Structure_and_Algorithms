package Leetcode;

public class Maximum_Absolute_Sum_of_Any_Subarray {
    public int maxAbsoluteSum(int[] nums) {
        int n = nums.length;
        int sum = 0;
        int minSum = 0;
        int maxSum = 0;

        for (int i = 0; i < n; i++) {
            sum = sum + nums[i];
            if (sum > maxSum) maxSum = sum;
            if (sum < minSum) minSum = sum;
        }
        return Math.abs(maxSum - minSum);
    }

    public static void main(String[] args) {
        Maximum_Absolute_Sum_of_Any_Subarray solution = new Maximum_Absolute_Sum_of_Any_Subarray();

        // Example test cases
        int[] nums1 = {1, -3, 2, 3, -4};
        System.out.println("Max Absolute Sum: " + solution.maxAbsoluteSum(nums1)); // Output: 5

        int[] nums2 = {2, -5, 1, -4, 3, -2};
        System.out.println("Max Absolute Sum: " + solution.maxAbsoluteSum(nums2)); // Output: 8

        int[] nums3 = {1, 2, 3, 4, 5};
        System.out.println("Max Absolute Sum: " + solution.maxAbsoluteSum(nums3)); // Output: 15
    }
}
