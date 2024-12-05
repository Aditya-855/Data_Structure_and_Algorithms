package Leetcode;

public class Longest_Palindromic_Substring {
    int max = 0, start = 0, end = 0; // Variables to store the max length and start/end indices of the longest palindrome.

    // Helper method to check if a substring is a palindrome.
    public boolean isPalindrome(String s, int i, int j) {
        while (i < j) { // Check characters from both ends moving inward.
            if (s.charAt(i) != s.charAt(j)) { // If characters don't match, it's not a palindrome.
                return false;
            }
            i++; // Move the start pointer forward.
            j--; // Move the end pointer backward.
        }
        return true; // All characters matched, so it's a palindrome.
    }

    // Method to find the longest palindromic substring.
    public String longestPalindrome(String s) {
        int n = s.length(); // Length of the input string.

        // Edge case: if the string is empty or has length 1.
        if (n <= 1) {
            return s;
        }

        // Iterate over all possible substrings.
        for (int i = 0; i < n; i++) { // Starting index.
            for (int j = i; j < n; j++) { // Ending index.
                if (isPalindrome(s, i, j)) { // Check if the substring s[i..j] is a palindrome.
                    if ((j - i + 1) > max) { // If this palindrome is longer than the current max.
                        max = j - i + 1; // Update max length.
                        start = i; // Update starting index.
                        end = j; // Update ending index.
                    }
                }
            }
        }

        // Return the longest palindromic substring.
        return s.substring(start, end );
    }

    public static void main(String[] args) {
        Longest_Palindromic_Substring solution = new Longest_Palindromic_Substring(); // Create an instance of the Solution class.

        // Test case 1
        String input1 = "babad";
        System.out.println("Input: " + input1);
        System.out.println("Longest Palindromic Substring: " + solution.longestPalindrome(input1));

        // Test case 2
        String input2 = "cbbd";
        System.out.println("\nInput: " + input2);
        System.out.println("Longest Palindromic Substring: " + solution.longestPalindrome(input2));

        // Test case 3
        String input3 = "a";
        System.out.println("\nInput: " + input3);
        System.out.println("Longest Palindromic Substring: " + solution.longestPalindrome(input3));

        // Test case 4
        String input4 = "ac";
        System.out.println("\nInput: " + input4);
        System.out.println("Longest Palindromic Substring: " + solution.longestPalindrome(input4));

        // Test case 5
        String input5 = "forgeeksskeegfor";
        System.out.println("\nInput: " + input5);
        System.out.println("Longest Palindromic Substring: " + solution.longestPalindrome(input5));
    }
}
