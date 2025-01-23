package Leetcode;

import java.util.*;

public class Four_Sum {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        // List to store the result
        List<List<Integer>> res = new ArrayList<>();
        // Sort the array to enable two-pointer technique
        Arrays.sort(nums);
        // Set to track unique combinations
        HashSet<String> unique = new HashSet<>();

        // Outer loop to pick the first number
        for (int i = 0; i < nums.length - 3; i++) {
            // Inner loop to pick the second number
            for (int j = i + 1; j < nums.length - 2; j++) {
                int left = j + 1; // Pointer to the third number
                int right = nums.length - 1; // Pointer to the fourth number

                // Two-pointer approach to find the remaining two numbers
                while (left < right) {
                    // Use long to handle potential overflow with large numbers
                    long sum = (long) nums[i] + nums[j] + nums[left] + nums[right];

                    if (sum < target) {
                        // If the sum is less than the target, move left pointer to increase the sum
                        left++;
                    } else if (sum > target) {
                        // If the sum is greater than the target, move right pointer to decrease the sum
                        right--;
                    } else {
                        // If the sum matches the target
                        // Build a unique identifier for this quadruplet
                        StringBuilder sb = new StringBuilder();
                        sb.append(nums[i]).append(nums[j]).append(nums[left]).append(nums[right]);
                        String code = sb.toString();

                        // If this combination is not already in the set
                        if (!unique.contains(code)) {
                            unique.add(code); // Add to the set
                            // Add this quadruplet to the result
                            res.add(Arrays.asList(nums[i], nums[j], nums[left], nums[right]));
                        }

                        // Move both pointers to continue finding other combinations
                        left++;
                        right--;
                    }
                }
            }
        }
        // Return the list of quadruplets
        return res;
    }

    public static void main(String[] args) {
        // Test case
        Four_Sum solution = new Four_Sum();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;

        // Call the fourSum method and print the result
        List<List<Integer>> result = solution.fourSum(nums, target);

        // Print each quadruplet
        System.out.println("Quadruplets that sum to target:");
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }

        // Additional test case for large numbers
        nums = new int[]{1000000000, 1000000000, 1000000000, 1000000000};
        target = -294967296;
        result = solution.fourSum(nums, target);
        System.out.println("Quadruplets for large numbers and negative target:");
        for (List<Integer> quadruplet : result) {
            System.out.println(quadruplet);
        }
    }
}
