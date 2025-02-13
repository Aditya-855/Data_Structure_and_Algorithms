package Leetcode;

import java.util.PriorityQueue;

public class Minimum_Operations_to_Exceed_Threshold_Value_II {
    /**
     * This method calculates the minimum number of operations required to make all elements
     * in the priority queue at least 'k'. In each operation, the two smallest elements
     * are removed and a new element is inserted as (smallest * 2 + second smallest).
     *
     * @param nums An array of integers.
     * @param k The threshold value.
     * @return The minimum number of operations required.
     */
    public int minOperations(int[] nums, int k) {
        // Create a min-heap (priority queue) to store numbers
        PriorityQueue<Long> pq = new PriorityQueue<>();

        // Add all elements from the array into the priority queue
        for (int num : nums) {
            pq.offer((long) num);
        }

        int count = 0; // Initialize operation counter

        // Continue processing until all elements are at least 'k'
        while (!pq.isEmpty() && pq.peek() < k) {
            long smallest = pq.poll(); // Extract the smallest element
            long Ssmallest = pq.poll(); // Extract the second smallest element

            // Combine the two smallest elements and insert back into the queue
            pq.offer(smallest * 2 + Ssmallest);
            count++; // Increment operation count
        }

        return count; // Return the total number of operations
    }

    // Main method to test the function
    public static void main(String[] args) {
        Minimum_Operations_to_Exceed_Threshold_Value_II solution = new  Minimum_Operations_to_Exceed_Threshold_Value_II();
        int[] nums = {1, 2, 3, 9, 10, 12}; // Example input
        int k = 7; // Threshold value

        int result = solution.minOperations(nums, k);
        System.out.println("Minimum operations required: " + result); // Output result
    }
}
