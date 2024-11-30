package Leetcode;
import java.util.*;

public class Length_Of_Longest_Substring{
    public static void main(String[] args) {
        // Test cases
        String test1 = "abcabcbb";
        String test2 = "bbbbb";
        String test3 = "pwwkew";
        String test4 = "";
        String test5 = "abcdef";

        System.out.println("Length of longest substring (\"" + test1 + "\"): " + lengthOfLongestSubstring(test1));
        System.out.println("Length of longest substring (\"" + test2 + "\"): " + lengthOfLongestSubstring(test2));
        System.out.println("Length of longest substring (\"" + test3 + "\"): " + lengthOfLongestSubstring(test3));
        System.out.println("Length of longest substring (\"" + test4 + "\"): " + lengthOfLongestSubstring(test4));
        System.out.println("Length of longest substring (\"" + test5 + "\"): " + lengthOfLongestSubstring(test5));
    }

    public static int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max_length = 0;

        List<Character> list = new ArrayList<Character>();
        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                max_length = Math.max(max_length, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max_length;
    }
}
