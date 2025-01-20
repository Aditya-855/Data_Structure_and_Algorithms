package Leetcode;

import java.util.*;
public class Three_Sum {
    public List<List<Integer>> threeSum(int[] nums) {
        // Use a set to store unique triplets
        Set<List<Integer>> res = new HashSet<>();

        // If the input array is empty, return an empty list
        if (nums.length == 0) return new ArrayList<>(res);

        // Sort the array to simplify the two-pointer technique
        Arrays.sort(nums);

        // Iterate through the array
        for (int i = 0; i < nums.length - 2; i++) {
            int j = i + 1; // Start pointer
            int k = nums.length - 1; // End pointer

            // Use two pointers to find two numbers whose sum equals -nums[i]
            while (j < k) {
                int sum = nums[j] + nums[k]; // Calculate the sum of two pointers

                if (sum == -nums[i]) {
                    // If a triplet is found, add it to the result set
                    res.add(Arrays.asList(nums[i], nums[j++], nums[k--]));
                } else if (sum > -nums[i]) {
                    // If the sum is too large, decrement the end pointer
                    k--;
                } else {
                    // If the sum is too small, increment the start pointer
                    j++;
                }
            }
        }

        // Convert the set of triplets to a list and return it
        return new ArrayList<>(res);
    }

    public static void main(String[] args) {
        Three_Sum  solution = new Three_Sum ();

        // Test case: Example input array
        int[] nums = {-1, 0, 1, 2, -1, -4};

        // Call the threeSum method
        List<List<Integer>> result = solution.threeSum(nums);

        // Print the result
        System.out.println("Unique triplets that sum to zero:");
        for (List<Integer> triplet : result) {
            System.out.println(triplet);
        }
    }
}

