package Leetcode;

public class Check_If_One_String_Swap_Can_Make_String_Equals {
    // Method to check if two strings are almost equal by swapping exactly one pair of characters
    public boolean areAlmostEqual(String s1, String s2) {
        int n = s1.length();

        // If both strings are already equal, return true
        if (s1.equals(s2)) {
            return true;
        }

        int diffs = 0; // Count of different characters
        int firstIdx = 0, secondIdx = 0; // Indices of differing characters

        // Iterate through both strings to find mismatched characters
        for (int i = 0; i < n; i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                diffs++;

                // If there are more than 2 differences, return false immediately
                if (diffs > 2) {
                    return false;
                }
                // Store the indices of the first and second differences
                else if (diffs == 1) {
                    firstIdx = i;
                } else {
                    secondIdx = i;
                }
            }
        }

        // Check if swapping the differing characters would make the strings equal
        return diffs == 2 && s1.charAt(firstIdx) == s2.charAt(secondIdx) && s1.charAt(secondIdx) == s2.charAt(firstIdx);
    }

    public static void main(String[] args) {
        Check_If_One_String_Swap_Can_Make_String_Equals solution = new Check_If_One_String_Swap_Can_Make_String_Equals();

        // Test cases
        System.out.println(solution.areAlmostEqual("bank", "kanb")); // true, swap 'b' and 'k'
        System.out.println(solution.areAlmostEqual("attack", "defend")); // false, more than one swap needed
        System.out.println(solution.areAlmostEqual("kelb", "kelb")); // true, already equal
        System.out.println(solution.areAlmostEqual("abcd", "abdc")); // true, swap 'c' and 'd'
        System.out.println(solution.areAlmostEqual("abcd", "acbd")); // false, needs two swaps
    }
}
