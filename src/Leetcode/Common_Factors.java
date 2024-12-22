package Leetcode;

public class Common_Factors {
    // Method to calculate the number of common factors between two numbers
    public int commonFactors(int a, int b) {
        int count = 0; // Initialize the count of common factors to 0

        // Iterate from 1 to the smaller of the two numbers
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) { // Check if 'i' is a common factor of both 'a' and 'b'
                count++; // Increment the count if 'i' is a common factor
            }
        }

        return count; // Return the total count of common factors
    }

    public static void main(String[] args) {
        Common_Factors solution = new Common_Factors(); // Create an instance of the Solution class

        // Test cases
        int[][] testCases = {
                {12, 18}, // Common factors: 1, 2, 3, 6
                {25, 30}, // Common factors: 1, 5
                {8, 16},  // Common factors: 1, 2, 4, 8
                {7, 13},  // Common factors: 1
                {100, 200} // Common factors: 1, 2, 4, 5, 10, 20, 25, 50, 100
        };

        // Iterate through test cases and print the results
        for (int[] testCase : testCases) {
            int a = testCase[0];
            int b = testCase[1];
            System.out.println("Common factors of " + a + " and " + b + ": " + solution.commonFactors(a, b));
        }
    }
}

