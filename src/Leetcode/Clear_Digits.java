package Leetcode;

import java.util.Scanner;
public class Clear_Digits {
    public String clearDigits(String s) {
        int i = 0; // Initialize an index pointer
        StringBuilder sb = new StringBuilder(s); // Use StringBuilder for efficient modifications

        while (i < sb.length()) { // Loop through the string
            if (Character.isDigit(sb.charAt(i))) { // Check if the current character is a digit
                sb.deleteCharAt(i); // Remove the digit

                if (i - 1 >= 0) { // Ensure there is a previous character before removing it
                    sb.deleteCharAt(i - 1); // Remove the character before the digit
                    i--; // Adjust index to avoid skipping characters
                }
            } else {
                i++; // Move to the next character
            }
        }
        return sb.toString(); // Return the modified string
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine(); // Take input from the user

        Clear_Digits sol = new Clear_Digits(); // Create an instance of Solution
        String result = sol.clearDigits(input); // Call the method

        System.out.println("Result after removing digits and preceding characters: " + result);

        scanner.close(); // Close the scanner
    }
}
