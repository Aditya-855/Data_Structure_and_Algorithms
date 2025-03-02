package Leetcode;

public class Check_If_Digits_Are_Equal_in_String_After_Operations_I {
    public boolean hasSameDigits(String s) {
        int n = s.length(); // Get the length of the input string
        int[] digit = new int[n]; // Create an integer array to store digits

        // Convert each character in the string into an integer and store it in the array
        for (int i = 0; i < n; i++) {
            digit[i] = s.charAt(i) - '0'; // Convert character to integer
        }

        // Reduce the array to two digits by summing adjacent elements modulo 10
        while (n > 2) { // Continue reducing until only two digits remain
            for (int i = 0; i < n - 1; i++) {
                digit[i] = (digit[i] + digit[i + 1]) % 10; // Sum adjacent digits and take modulo 10
            }
            n--; // Reduce the size of the array (ignore the last element in the next iteration)
        }

        // Check if the last two remaining digits are the same
        return digit[0] == digit[1];
    }

    // Main method to test the function
    public static void main(String[] args) {
        Check_If_Digits_Are_Equal_in_String_After_Operations_I sol = new Check_If_Digits_Are_Equal_in_String_After_Operations_I(); // Create an instance of the Solution class

        // Test cases
        String test1 = "1234"; // Example case
        String test2 = "98765";
        String test3 = "112233";

        // Printing the results
        System.out.println("Has same digits (1234)? " + sol.hasSameDigits(test1)); // Expected: false
        System.out.println("Has same digits (98765)? " + sol.hasSameDigits(test2)); // Expected: false
        System.out.println("Has same digits (112233)? " + sol.hasSameDigits(test3)); // Expected: true or false (depends on calculations)
    }
}
