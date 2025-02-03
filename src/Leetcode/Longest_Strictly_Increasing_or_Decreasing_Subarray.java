package Leetcode;

import java.util.*;

public class Longest_Strictly_Increasing_or_Decreasing_Subarray {
    public int longestMonotonicSubarray(int[] nums) {
        int n = nums.length;
        int res = 0;

        for (int i = 0; i < n; i++) {
            int incr = 1;
            int j = i + 1;

            while (j < n && nums[j] > nums[j - 1]) {
                incr++;
                j++;
            }
            j = i + 1;
            int decr = 1;

            while (j < n && nums[j] < nums[j - 1]) {
                decr++;
                j++;
            }
            res = Math.max(res, Math.max(incr, decr));
        }
        return res;
    }

    public static void main(String[] args) {
        Longest_Strictly_Increasing_or_Decreasing_Subarray sol = new Longest_Strictly_Increasing_or_Decreasing_Subarray();
        int[] nums = {1, 3, 5, 4, 2, 8, 10, 9};
        System.out.println("Longest Monotonic Subarray Length: " + sol.longestMonotonicSubarray(nums));
    }
}
