package Leetcode;

public class Maximum_Ascending_Subarray_Sum {
    public int maxAscendingSum(int[] nums) {
        int n = nums.length;
        int maxSum = 0;
        int sum = nums[0];

        for (int i = 1; i < n; i++) {
            if (nums[i] > nums[i - 1]) {
                sum = sum + nums[i];
            } else {
                maxSum = Math.max(maxSum, sum);
                sum = nums[i];
            }
        }
        return Math.max(maxSum, sum);
    }

    public static void main(String[] args) {
        Maximum_Ascending_Subarray_Sum sol = new Maximum_Ascending_Subarray_Sum();
        int[] nums = {10, 20, 30, 5, 10, 50};
        System.out.println("Maximum Ascending Sum: " + sol.maxAscendingSum(nums));
    }
}
