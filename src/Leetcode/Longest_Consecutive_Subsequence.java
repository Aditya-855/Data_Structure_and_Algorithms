package Leetcode;
import java.util.HashSet;
import java.util.Set;
public class Longest_Consecutive_Subsequence {
    // Method to find the length of the longest consecutive sequence
    public int longestConsecutive(int[] nums) {
        // Create a HashSet to store unique numbers for quick look-up
        Set<Integer> set = new HashSet<>();
        // Add all numbers from the array into the HashSet
        for (int i : nums) {
            set.add(i);
        }

        // Initialize a variable to store the length of the longest consecutive sequence
        int ans = 0;

        // Iterate through each number in the original array
        for (int i : nums) {
            // Check if the current number is the start of a new sequence
            if (!set.contains(i - 1)) {
                // Start counting the sequence length from the current number
                int current = i + 1;

                // While the next consecutive number exists in the set, keep moving forward
                while (set.contains(current)) {
                    current = current + 1;
                }

                // At this point, we've reached the end of the current sequence
                int lastEl = current - 1; // The last element of the sequence
                int length = lastEl - i + 1; // Calculate the length of the sequence

                // Update the maximum sequence length found so far
                ans = Math.max(ans, length);
            }
        }

        // Return the length of the longest consecutive sequence
        return ans;
    }

    // Main method to test the code
    public static void main(String[] args) {
        Longest_Consecutive_Subsequence solution = new Longest_Consecutive_Subsequence();

        // Test case 1
        int[] nums1 = {100, 4, 200, 1, 3, 2};
        System.out.println("Longest Consecutive Sequence Length: " + solution.longestConsecutive(nums1));
        // Expected Output: 4 (sequence is [1, 2, 3, 4])

        // Test case 2
        int[] nums2 = {0, 3, 7, 2, 5, 8, 4, 6, 0, 1};
        System.out.println("Longest Consecutive Sequence Length: " + solution.longestConsecutive(nums2));
        // Expected Output: 9 (sequence is [0, 1, 2, 3, 4, 5, 6, 7, 8])

        // Test case 3
        int[] nums3 = {};
        System.out.println("Longest Consecutive Sequence Length: " + solution.longestConsecutive(nums3));
        // Expected Output: 0 (empty array)

        // Test case 4
        int[] nums4 = {1, 2, 0, 1};
        System.out.println("Longest Consecutive Sequence Length: " + solution.longestConsecutive(nums4));
        // Expected Output: 3 (sequence is [0, 1, 2])
    }
}
