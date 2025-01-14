package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        // Define an array of integers and a target sum value
        int[] arr = {2, 7, 11, 15};
        int target = 9;

        // Call the twoSum method and print the result as an array
        System.out.println(Arrays.toString(twoSum(arr, target)));
    }

    // Method to find two numbers that add up to the target
    public static int[] twoSum(int[] arr, int target) {
        // Create a HashMap to store array elements and their indices
        HashMap<Integer, Integer> Hm = new HashMap<>();

        // Iterate through the array
        for (int i = 0; i < arr.length; i++) {
            // Calculate the number required to reach the target sum
            int req_no = target - arr[i];

            // Check if the required number already exists in the map
            if (Hm.containsKey(req_no)) {
                // If found, return the indices of the two numbers as an array
                int[] nums = {Hm.get(req_no), i};
                return nums;
            }

            // Store the current number and its index in the map
            Hm.put(arr[i], i);
        }

        // Return null if no solution is found (this assumes input always has a solution)
        return null;
    }
}
