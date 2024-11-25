package Leetcode;

import java.util.List;
import java.util.ArrayList;

public class Permutations {
    public static void main(String[] args) {
        // Input array
        int[] nums = {1, 2, 3};

        // Create an instance of Solution
        Solution solution = new Solution();

        // Get all permutations of the array
        List<List<Integer>> result = solution.permute(nums);

        // Print the result
        System.out.println("All permutations:");
        for (List<Integer> permutation : result) {
            System.out.println(permutation);
        }
    }
}

class Solution {
    private void Rp(int[] nums, List<Integer> ds, List<List<Integer>> ans, boolean[] freq) {
        if (ds.size() == nums.length) {
            ans.add(new ArrayList<>(ds));
            return;
        }
        for (int i = 0; i < nums.length; i++) {
            if (!freq[i]) {
                freq[i] = true;
                ds.add(nums[i]);
                Rp(nums, ds, ans, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> ds = new ArrayList<>();
        boolean[] freq = new boolean[nums.length];
        Rp(nums, ds, ans, freq);
        return ans;
    }
}