package Leetcode;

import java.util.Arrays;

public class Final_Value_of_Variable_After_Performing_Operations {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;

        // Loop through each operation
        for (int i = 0; i < operations.length; i++) {
            if (operations[i].equals("++X") || operations[i].equals("X++")) {
                count++;  // Increment count
            } else {
                count--;  // Decrement count
            }
        }

        return count; // Return the final result
    }

    public static void main(String[] args) {
        Final_Value_of_Variable_After_Performing_Operations solution = new Final_Value_of_Variable_After_Performing_Operations();

        // Test Case 1
        String[] operations1 = {"--X", "X++", "X++"};
        System.out.println("Final Value: " + solution.finalValueAfterOperations(operations1)); // Output: 1

        // Test Case 2
        String[] operations2 = {"++X", "++X", "X++"};
        System.out.println("Final Value: " + solution.finalValueAfterOperations(operations2)); // Output: 3

        // Test Case 3
        String[] operations3 = {"X--", "X--", "--X", "X++"};
        System.out.println("Final Value: " + solution.finalValueAfterOperations(operations3)); // Output: -2
    }
}
