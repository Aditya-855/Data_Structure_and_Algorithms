package Leetcode;
import java.util.*;
public class Find_Score_Of_Array {
    public long findScore(int[] nums) {
        // Create a priority queue to store array elements and their indices.
        // The elements are sorted first by their value (nums[i]) in ascending order.
        // If two elements have the same value, they are sorted by their index in ascending order.
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[0] == b[0] ? a[1] - b[1] : a[0] - b[0]);

        // Populate the priority queue with the value and index of each element in the array.
        for (int i = 0; i < nums.length; i++) {
            pq.offer(new int[]{nums[i], i}); // Add element [value, index] to the priority queue.
        }

        // Use a set to keep track of indices that have been marked as "invalid" or "visited".
        Set<Integer> set = new HashSet<>();

        // Initialize the total score to 0.
        long score = 0;

        // Process the priority queue until it is empty or all indices are marked in the set.
        while (!pq.isEmpty() && set.size() != nums.length) {
            // Retrieve and remove the smallest element from the priority queue.
            int[] top = pq.poll();

            // If the current index is already in the set (marked as invalid), skip it.
            if (set.contains(top[1])) {
                continue;
            }

            // Add the value of the current element to the score.
            score += top[0];

            // Mark the neighboring indices (left and right) as invalid by adding them to the set.
            if (top[1] - 1 >= 0) { // Check if the left neighbor exists.
                set.add(top[1] - 1);
            }
            if (top[1] + 1 < nums.length) { // Check if the right neighbor exists.
                set.add(top[1] + 1);
            }
        }

        // Return the calculated score.
        return score;
    }

    // Main method for testing the solution
    public static void main(String[] args) {
        Find_Score_Of_Array solution = new Find_Score_Of_Array();

        // Test input
        int[] nums = {4, 3, 2, 6, 1};

        // Calculate the score
        long result = solution.findScore(nums);

        // Print the result
        System.out.println("The calculated score is: " + result);
    }
}
