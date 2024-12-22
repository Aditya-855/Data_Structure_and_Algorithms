package Leetcode;

public class Smallest_Even_Multiple {
    // Method to find the smallest even multiple of a given number 'n'
    public int smallestEvenMultiple(int n) {
        int ans = 0; // Initialize a variable to store the result

        if (n % 2 == 0) return n; // If 'n' is even, return 'n' itself

        if (n % 2 != 0) {
            ans = n * 2; // If 'n' is odd, calculate and store 'n * 2' in 'ans'
        }

        return ans; // Return the result
    }

    public static void main(String[] args) {
        Smallest_Even_Multiple solution = new Smallest_Even_Multiple(); // Create an instance of the Solution class

        // Test case 1: Input is even
        int n1 = 4;
        System.out.println("Smallest even multiple of " + n1 + ": " + solution.smallestEvenMultiple(n1));

        // Test case 2: Input is odd
        int n2 = 5;
        System.out.println("Smallest even multiple of " + n2 + ": " + solution.smallestEvenMultiple(n2));

        // Test case 3: Input is 1 (edge case)
        int n3 = 1;
        System.out.println("Smallest even multiple of " + n3 + ": " + solution.smallestEvenMultiple(n3));
    }
}
