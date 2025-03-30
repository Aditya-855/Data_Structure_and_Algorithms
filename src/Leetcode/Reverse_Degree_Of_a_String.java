package Leetcode;

public class Reverse_Degree_Of_a_String {
    public int reverseDegree(String s) {
        int n = s.length(); // Get the length of the string
        int sum = 0; // Initialize sum to store the final result

        // Iterate through each character in the string
        for (int i = 0; i < n; i++) {
            // Calculate reverse alphabetical position of the character
            // 'a' -> 26, 'b' -> 25, 'c' -> 24, ..., 'z' -> 1
            int reverseValue = 26 - (s.charAt(i) - 'a');

            // Multiply by the position (1-based index) and accumulate in sum
            sum += reverseValue * (i + 1);
        }
        return sum; // Return the final computed sum
    }

    // Main method to test the function
    public static void main(String[] args) {
        Reverse_Degree_Of_a_String solution = new Reverse_Degree_Of_a_String(); // Create an instance of Solution

        // Test cases
        String test1 = "abc"; // Expected output: 148
        String test2 = "xyz"; // Expected output: 44
        String test3 = "hello"; // Example test case

        // Compute and print results
        System.out.println("Reverse Degree of '" + test1 + "': " + solution.reverseDegree(test1));
        System.out.println("Reverse Degree of '" + test2 + "': " + solution.reverseDegree(test2));
        System.out.println("Reverse Degree of '" + test3 + "': " + solution.reverseDegree(test3));
    }
}
