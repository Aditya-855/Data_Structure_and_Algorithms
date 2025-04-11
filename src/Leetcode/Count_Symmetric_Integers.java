package Leetcode;

public class Count_Symmetric_Integers {
    // Method to count symmetric integers between low and high (inclusive)
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;

        // Iterate over all integers in the given range
        for (int num = low; num <= high; num++) {
            String s = Integer.toString(num);  // Convert the number to a string to access its digits
            int len = s.length();              // Length of the number

            if (len % 2 != 0) continue;        // Skip numbers with odd number of digits

            int mid = len / 2;                 // Find the middle point
            int leftSum = 0, rightSum = 0;     // Variables to hold sum of left and right halves

            // Calculate the sum of the first and second halves
            for (int i = 0; i < mid; i++) {
                leftSum += s.charAt(i) - '0';         // Convert char to int by subtracting '0'
                rightSum += s.charAt(i + mid) - '0';  // Sum the digits in the right half
            }

            // If the sum of left and right halves are equal, it's a symmetric number
            if (leftSum == rightSum) {
                count++;
            }
        }

        return count;  // Return total count of symmetric integers
    }

    // Main method to test the code
    public static void main(String[] args) {
        Count_Symmetric_Integers sol = new Count_Symmetric_Integers();

        int low = 100;
        int high = 500;

        int result = sol.countSymmetricIntegers(low, high);

        System.out.println("Count of symmetric integers between " + low + " and " + high + " is: " + result);
    }
}
