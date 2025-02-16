package Leetcode;

public class Sorting_The_Sentence {
    public String sortSentence(String s) {
        // Splitting the input sentence into words
        String[] str = s.split(" ");

        // Array to store words in the correct order
        String[] arr = new String[str.length];

        // Loop through each word in the input sentence
        for (String t : str) {
            int n = t.length(); // Get the length of the word
            int pos = t.charAt(n - 1) - '0'; // Extract position by converting last char to int

            // Store the word in its correct position, excluding the last digit
            arr[pos - 1] = t.substring(0, n - 1);
        }

        // Using StringBuilder to efficiently construct the final sentence
        StringBuilder sb = new StringBuilder();
        for (String t : arr) {
            sb.append(t);
            sb.append(" ");
        }

        // Convert StringBuilder to String and remove trailing space
        return sb.toString().trim();
    }

    public static void main(String[] args) {
        Sorting_The_Sentence solution = new Sorting_The_Sentence();

        // Test case input
        String input = "is2 sentence4 This1 a3";

        // Calling the function and printing the output
        String result = solution.sortSentence(input);
        System.out.println(result);
    }
}
