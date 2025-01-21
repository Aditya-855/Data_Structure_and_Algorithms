package Leetcode;

public class Length_Of_LastWord {
    // Method to find the length of the last word in a given string
    public int lengthOfLastWord(String s) {
        int length = 0; // Variable to store the length of the last word

        // Loop through the string in reverse to locate the last word
        for (int i = s.length() - 1; i >= 0; i--) {
            if (s.charAt(i) != ' ') { // If the character is not a space
                length++; // Increment the length counter
            } else { // If the character is a space
                if (length > 0) // If we have already started counting a word
                    return length; // Return the length of the last word
            }
        }
        return length; // Return the length in case the loop ends without encountering a space
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Length_Of_LastWord solution = new Length_Of_LastWord();

        // Test case 1: A normal string
        String test1 = "Hello World";
        System.out.println("Length of last word: " + solution.lengthOfLastWord(test1)); // Output: 5

        // Test case 2: String with trailing spaces
        String test2 = "Java Programming   ";
        System.out.println("Length of last word: " + solution.lengthOfLastWord(test2)); // Output: 11

        // Test case 3: Single word string
        String test3 = "OpenAI";
        System.out.println("Length of last word: " + solution.lengthOfLastWord(test3)); // Output: 6

        // Test case 4: Empty string
        String test4 = "";
        System.out.println("Length of last word: " + solution.lengthOfLastWord(test4)); // Output: 0

        // Test case 5: String with only spaces
        String test5 = "      ";
        System.out.println("Length of last word: " + solution.lengthOfLastWord(test5)); // Output: 0
    }
}

