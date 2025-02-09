package Leetcode;

import java.util.HashMap;
import java.util.Map;

public class Count_Number_Of_Bad_Pairs {
    public long countBadPairs(int[] nums) {
        int n = nums.length;
        long result = 0;
        Map<Integer, Integer> mp = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < n; i++) {
            // Calculate the transformed value (nums[i] - i)
            int diff = nums[i] - i;

            // Get the count of previous occurrences of 'diff'
            int goodPairs = mp.getOrDefault(diff, 0);

            // Total pairs before index 'i' (i.e., how many elements before i)
            int totalPairsInPast = i;

            // Calculate bad pairs (Total pairs - Good pairs)
            result += (totalPairsInPast - goodPairs);

            // Update the count of 'diff' in the map
            mp.put(diff, goodPairs + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        // Example input
        int[] nums = {4, 1, 3, 3};

        // Create an instance of Solution class
        Count_Number_Of_Bad_Pairs sol = new Count_Number_Of_Bad_Pairs();

        // Call countBadPairs method and store result
        long result = sol.countBadPairs(nums);

        // Print the result
        System.out.println("Number of bad pairs: " + result);
    }
}
