package Leetcode;

public class Example {
    public String removeOccurrences(String s, String part) {
        while (true) {
            // Find the index of the first occurrence of "part" in "s".
            int idx = s.indexOf(part);

            // If "part" is not found, exit the loop.
            if (idx == -1) {
                break;
            }

            // Remove the found occurrence of "part" by concatenating the substring before and after it.
            s = s.substring(0, idx) + s.substring(idx + part.length());
        }
        return s;
    }

    public static void main(String[] args) {
        Example solution = new Example();

        // Example test cases
        String s1 = "daabcbaabcbc";
        String part1 = "abc";
        System.out.println("Result: " + solution.removeOccurrences(s1, part1)); // Expected: "dab"

        String s2 = "axxxxyyyyb";
        String part2 = "xy";
        System.out.println("Result: " + solution.removeOccurrences(s2, part2)); // Expected: "axxxb"
    }
}
