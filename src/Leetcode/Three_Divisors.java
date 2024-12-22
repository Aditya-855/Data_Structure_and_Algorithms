package Leetcode;

public class Three_Divisors {
    // Method to check if a number has exactly three divisors
    public boolean isThree(int n) {
        int count = 2; // Start with 2 because 1 and n are always divisors of n.

        // Check divisors from 2 to n-1
        for (int i = 2; i < n; i++) {
            if (n % i == 0) { // Found a divisor
                count++; // Increment the count of divisors

                if (count > 3) { // If divisors exceed 3, return false early
                    return false;
                }
            }
        }
        // After the loop, check if the count of divisors is exactly 3
        return count == 3;
    }

    public static void main(String[] args) {
        Three_Divisors solution = new Three_Divisors(); // Create an instance of the Solution class

        // Test cases
        int[] testCases = {4, 9, 10, 15, 16};
        for (int n : testCases) {
            System.out.println("Does " + n + " have exactly three divisors? " + solution.isThree(n));
        }
    }
}

