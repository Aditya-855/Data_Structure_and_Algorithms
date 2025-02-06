package Leetcode;

import java.util.*;

public class Tuples_With_Same_Product {
    public int tupleSameProduct(int[] nums) {
        int n = nums.length;
        int tuples = 0;

        // HashMap to store the product of two numbers and their frequency
        Map<Integer, Integer> mp = new HashMap<>();

        // Iterate over all pairs of numbers
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                int p = nums[i] * nums[j]; // Calculate product
                mp.put(p, mp.getOrDefault(p, 0) + 1); // Store frequency of product
            }
        }

        // Calculate the number of tuples
        for (Map.Entry<Integer, Integer> it : mp.entrySet()) {
            int freq = it.getValue();
            tuples += (freq * (freq - 1) / 2); // Combination formula to choose two pairs
        }

        return tuples * 8; // Each tuple contributes to 8 different permutations
    }

    // Main method to test the function
    public static void main(String[] args) {
        Tuples_With_Same_Product  sol = new Tuples_With_Same_Product ();
        int[] nums = {2, 3, 4, 6}; // Example input
        int result = sol.tupleSameProduct(nums);
        System.out.println("Number of tuples with the same product: " + result);
    }
}
