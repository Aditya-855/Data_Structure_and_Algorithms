package Leetcode;

public class Percentage_of_Letter_in_String {
    // Method to calculate the percentage of 'letter' in string 's'
    public int percentageLetter(String s, char letter) {
        int n = s.length();  // Get the length of the string
        int count = 0;        // Initialize count of occurrences of 'letter'

        // Loop through the string to count occurrences of 'letter'
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == letter) {  // Compare each character with 'letter'
                count++;
            }
        }
        // Calculate percentage: (count * 100) / total length
        return (count * 100) / n;
    }

    // Main method to test the function
    public static void main(String[] args) {
        Percentage_of_Letter_in_String solution = new Percentage_of_Letter_in_String();  // Create an object of Solution class

        String s = "hello";  // Sample input string
        char letter = 'l';   // Character to find percentage of

        int result = solution.percentageLetter(s, letter);  // Call the method
        System.out.println("Percentage of '" + letter + "' in \"" + s + "\": " + result + "%");
    }
}
