package Leetcode;

public class Number_of_Good_Pairs {
    public int numIdenticalPairs(int[] nums) {
        int count = 0;
        int n = nums.length;

        // Iterate over all pairs (i, j)
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (nums[i] == nums[j] && i < j) {
                    count++;  // Count the valid pair
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        Number_of_Good_Pairs solution = new Number_of_Good_Pairs();

        // Test Case 1
        int[] nums1 = {1, 2, 3, 1, 1, 3};
        System.out.println("Number of Identical Pairs: " + solution.numIdenticalPairs(nums1)); // Output: 4

        // Test Case 2
        int[] nums2 = {1, 1, 1, 1};
        System.out.println("Number of Identical Pairs: " + solution.numIdenticalPairs(nums2)); // Output: 6

        // Test Case 3
        int[] nums3 = {1, 2, 3};
        System.out.println("Number of Identical Pairs: " + solution.numIdenticalPairs(nums3)); // Output: 0
    }
}
