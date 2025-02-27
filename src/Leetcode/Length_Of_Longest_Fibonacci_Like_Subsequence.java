package Leetcode;

import java.util.*;

public class Length_Of_Longest_Fibonacci_Like_Subsequence {
    public int lenLongestFibSubseq(int[] arr) {
        int n = arr.length;
        int[][] dp = new int[n][n]; // DP table to store longest Fibonacci-like subsequence ending at (i, j)
        int maxLen = 0; // To store the maximum length found

        // Traverse the array starting from the third element
        for (int curr = 2; curr < n; curr++) {
            int start = 0, end = curr - 1; // Two pointers approach

            while (start < end) {
                int pairSum = arr[start] + arr[end]; // Check if arr[start] + arr[end] forms arr[curr]

                if (pairSum > arr[curr]) {
                    end--; // Decrease end to get a smaller sum
                } else if (pairSum < arr[curr]) {
                    start++; // Increase start to get a larger sum
                } else {
                    // Found a Fibonacci-like sequence
                    dp[end][curr] = dp[start][end] + 1; // Extend the sequence
                    maxLen = Math.max(dp[end][curr], maxLen); // Update maxLen
                    end--; // Move both pointers inward
                    start++;
                }
            }
        }
        return maxLen == 0 ? 0 : maxLen + 2; // If no sequence found, return 0; else return actual length
    }

    public static void main(String[] args) {
        Length_Of_Longest_Fibonacci_Like_Subsequence solution = new Length_Of_Longest_Fibonacci_Like_Subsequence();

        // Example test case
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
        int result = solution.lenLongestFibSubseq(arr);

        System.out.println("Length of Longest Fibonacci like Subsequence: " + result);
    }
}
