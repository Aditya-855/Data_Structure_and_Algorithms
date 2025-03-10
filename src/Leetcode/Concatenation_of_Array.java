package Leetcode;

import java.util.Arrays;

public class Concatenation_of_Array {
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];

        for (int i = 0; i < n; i++) {
            ans[i] = nums[i];
            ans[i + n] = nums[i];
        }
        return ans;
    }

    public static void main(String[] args) {
        Concatenation_of_Array solution = new Concatenation_of_Array();

        int[] nums = {1, 2, 3}; // Example input
        int[] result = solution.getConcatenation(nums);

        System.out.println("Concatenated Array: " + Arrays.toString(result));
    }
}
