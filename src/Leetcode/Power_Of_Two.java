package Leetcode;

public class Power_Of_Two {
    public boolean isPowerOfTwo(int n) {
        // If n is 0, it cannot be a power of two.
        if (n == 0) {
            return false;
        }

        // Loop continues until n becomes 1 (the base case for power of two).
        while (n != 1) {
            // If n is not divisible by 2, it is not a power of two.
            if (n % 2 != 0) {
                return false;
            } else {
                // If n is divisible by 2, divide it by 2.
                n = n / 2;
            }
        }

        // If the loop exits (n becomes 1), it is a power of two.
        return true;
    }
    public static void main(String[] args) {
        Power_Of_Two  solution = new Power_Of_Two ();

        // Test cases
        int[] testNumbers = {0, 1, 2, 3, 4, 16, 18, 32, 64, 100};

        // Check each number and print if it is a power of two
        for (int n : testNumbers) {
            boolean result = solution.isPowerOfTwo(n);
            System.out.println("Is " + n + " a power of two? " + result);
        }
    }
}
