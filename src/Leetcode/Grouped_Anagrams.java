package Leetcode;

import java.util.*;

public class Grouped_Anagrams {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create a map to store sorted strings as keys and their corresponding anagram groups as values
        Map<String, List<String>> groupAnagrams = new HashMap<>();

        // Iterate over each string in the input array
        for (String str : strs) {
            // Convert the string to a character array to sort it
            char[] charArr = str.toCharArray();

            // Sort the character array to generate a canonical form of the anagram
            Arrays.sort(charArr);

            // Convert the sorted character array back to a string
            String sortedStr = String.valueOf(charArr);

            // Check if the sorted string is already a key in the map
            if (!groupAnagrams.containsKey(sortedStr)) {
                // If not present, create a new list for this anagram group
                groupAnagrams.put(sortedStr, new ArrayList<>());
            }

            // Add the original string to the corresponding anagram group
            groupAnagrams.get(sortedStr).add(str);
        }

        // Return the list of anagram groups
        return new ArrayList<>(groupAnagrams.values());
    }

    public static void main(String[] args) {
        Grouped_Anagrams solution = new Grouped_Anagrams();

        // Test input array of strings
        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        // Call the groupAnagrams method
        List<List<String>> result = solution.groupAnagrams(strs);

        // Print the grouped anagrams
        System.out.println("Grouped Anagrams: " + result);
    }
}

