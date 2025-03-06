package Leetcode;

import java.util.Arrays;

public class Find_Mising_and_Repeating_Values {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;  // Size of the grid (n x n)
        int size = n * n;     // Total expected elements from 1 to n^2
        int[] count = new int[size + 1]; // Array to store the frequency of numbers

        // Step 1: Count occurrences of each number in the grid
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                count[grid[i][j]]++; // Increment count for the found number
            }
        }

        int repeated = -1, missing = -1;

        // Step 2: Find the repeated and missing numbers
        for (int num = 1; num <= size; num++) {
            if (count[num] == 2) {
                repeated = num; // Found the number that appears twice
            } else if (count[num] == 0) {
                missing = num; // Found the missing number
            }
        }

        return new int[]{repeated, missing}; // Return result as an array
    }

    // Main method to test the function
    public static void main(String[] args) {
        Find_Mising_and_Repeating_Values solution = new Find_Mising_and_Repeating_Values();

        // Example input grid
        int[][] grid = {
                {1, 2},
                {2, 3}
        };

        // Find missing and repeated values
        int[] result = solution.findMissingAndRepeatedValues(grid);

        // Output the result
        System.out.println("Repeated Number: " + result[0]);
        System.out.println("Missing Number: " + result[1]);
    }
}
