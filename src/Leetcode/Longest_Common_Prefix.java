package Leetcode;
import java.util.Arrays;
public class Longest_Common_Prefix {
    // Method to find the longest common prefix
    public String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) {
            return "";
        }

        // Sort the array
        Arrays.sort(strs);
        String str1 = strs[0];
        String str2 = strs[strs.length - 1];
        int index = 0;

        // Compare characters of the first and last strings
        while (index < str1.length() && index < str2.length()) {
            if (str1.charAt(index) == str2.charAt(index)) {
                index++;
            } else {
                break;
            }
        }

        // Return the common prefix or an empty string
        return index == 0 ? "" : str1.substring(0, index);
    }
    public static void main(String[] args) {
        // Create an instance of the Solution class
        Longest_Common_Prefix solution = new Longest_Common_Prefix();

        // Test case 1
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs1)); // Output: "fl"

        // Test case 2
        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs2)); // Output: ""

        // Test case 3
        String[] strs3 = {"interstellar", "internet", "interval"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs3)); // Output: "inte"

        // Test case 4
        String[] strs4 = {"single"};
        System.out.println("Longest Common Prefix: " + solution.longestCommonPrefix(strs4)); // Output: "single"
    }
}
