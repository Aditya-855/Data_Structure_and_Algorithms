package Leetcode;

public class Remove_All_Occurence_Of_a_Substring {
    // Method to remove all occurrences of 'part' from 's'
    public String removeOccurrences(String s, String part) {
        while (true) {
            // Find the first occurrence of 'part' in 's'
            int idx = s.indexOf(part);

            // If 'part' is not found, break the loop
            if (idx == -1) {
                break;
            }
            // Remove the found 'part' from 's'
            s = s.substring(0, idx) + s.substring(idx + part.length());
        }
        return s; // Return the modified string
    }

    // Main method to test the functionality
    public static void main(String[] args) {
        Remove_All_Occurence_Of_a_Substring solution = new Remove_All_Occurence_Of_a_Substring();

        // Test cases
        String s1 = "daabcbaabcbc";
        String part1 = "abc";
        System.out.println("Result 1: " + solution.removeOccurrences(s1, part1));
        // Expected output: "dab"

        String s2 = "axxxxyyyyb";
        String part2 = "xy";
        System.out.println("Result 2: " + solution.removeOccurrences(s2, part2));
        // Expected output: "ab"
    }
}
