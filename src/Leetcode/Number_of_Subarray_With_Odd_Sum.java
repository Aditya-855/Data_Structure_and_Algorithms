package Leetcode;

public class Number_of_Subarray_With_Odd_Sum {
    public int numOfSubarrays(int[] arr) {
        long oddCount = 0, prefixSum = 0;
        int MOD = 1_000_000_007;

        // Iterate through the array
        for (int a : arr) {
            prefixSum += a;  // Update the prefix sum

            // If prefixSum is odd, increase oddCount
            oddCount += prefixSum % 2;
        }

        // Compute total number of odd sum subarrays
        oddCount += (arr.length - oddCount) * oddCount;

        // Return the result modulo 1_000_000_007
        return (int) (oddCount % MOD);
    }

    public static void main(String[] args) {
        Number_of_Subarray_With_Odd_Sum sol = new Number_of_Subarray_With_Odd_Sum();
        int[] arr = {1, 3, 5}; // Example test case

        // Call the function and print the result
        System.out.println(sol.numOfSubarrays(arr)); // Expected output: 4
    }
}
