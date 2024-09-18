package Leetcode;

import java.util.List;
import java.util.ArrayList;
public class Permutations_2 {
        private void recurPermute(int index, int[] nums, List<List<Integer>> ans) {
            // Base case: if index reaches the end of the array
            if (index == nums.length) {
                // Copy the current permutation to ans
                List<Integer> ds = new ArrayList<>();
                for (int i = 0; i < nums.length; i++) {
                    ds.add(nums[i]);
                }
                ans.add(new ArrayList<>(ds));
                return;
            }

            // Recursion to generate permutations
            for (int i = index; i < nums.length; i++) {
                swap(i, index, nums);
                recurPermute(index + 1, nums, ans);
                swap(i, index, nums);  // Backtrack to the previous state
            }
        }

        private void swap(int i, int j, int[] nums) {
            int t = nums[i];
            nums[i] = nums[j];
            nums[j] = t;
        }

        public List<List<Integer>> permute(int[] nums) {
            List<List<Integer>> ans = new ArrayList<>();
            recurPermute(0, nums, ans);
            return ans;
        }

        public static void main(String[] args) {
            Solution sol = new Solution();
            int[] nums = {1, 2, 3};  // Example input
            List<List<Integer>> permutations = sol.permute(nums);

            // Output the result
            for (List<Integer> perm : permutations) {
                System.out.println(perm);
            }
        }
    }

