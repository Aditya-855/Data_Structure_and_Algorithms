package Leetcode;

import java.util.Arrays;

public class Reverse_String {
    // Function to reverse a character array in-place
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length - 1; // Initialize two pointers

        // Swap characters from both ends moving towards the center
        while (i < j) {
            char temp = s[i]; // Store the left character
            s[i] = s[j]; // Swap left with right
            s[j] = temp; // Swap right with left
            i++; // Move left pointer forward
            j--; // Move right pointer backward
        }
    }

    public static void main(String[] args) {
        Reverse_String  solution = new Reverse_String ();

        // Test input character array
        char[] s = {'h', 'e', 'l', 'l', 'o'};

        // Printing original array
        System.out.println("Original array: " + Arrays.toString(s));

        // Calling the function to reverse the string
        solution.reverseString(s);

        // Printing the reversed array
        System.out.println("Reversed array: " + Arrays.toString(s));
    }
}

