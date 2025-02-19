package Leetcode;

import java.util.*;

public class The_kth_Lexicographical_String_of_All_Happy_Strings_of_Length_n {
    // Helper method to generate happy strings using recursion and backtracking
    public void solve(int n, StringBuilder curr, List<String> result) {
        // Base case: if the current string reaches the required length, add it to the result list
        if (curr.length() == n) {
            result.add(curr.toString());
            return;
        }

        // Try adding 'a', 'b', or 'c' to the current string
        for (char ch = 'a'; ch <= 'c'; ch++) {
            // Ensure no two adjacent characters are the same
            if (curr.length() > 0 && curr.charAt(curr.length() - 1) == ch) {
                continue;
            }

            // Append the character and recursively generate further
            curr.append(ch);
            solve(n, curr, result);
            // Backtrack: remove the last added character to try a new possibility
            curr.deleteCharAt(curr.length() - 1);
        }
    }

    // Main method to get the k-th lexicographically smallest happy string
    public String getHappyString(int n, int k) {
        List<String> result = new ArrayList<>();
        solve(n, new StringBuilder(), result);

        // If k is out of bounds, return an empty string
        if (result.size() < k) {
            return "";
        }
        // Return the k-th smallest happy string (1-based index)
        return result.get(k - 1);
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        The_kth_Lexicographical_String_of_All_Happy_Strings_of_Length_n solution = new The_kth_Lexicographical_String_of_All_Happy_Strings_of_Length_n();

        // Test cases
        int n = 3, k = 9;
        String result = solution.getHappyString(n, k);

        // Output the result
        System.out.println("The " + k + "-th happy string of length " + n + " is: " + result);
    }
}
