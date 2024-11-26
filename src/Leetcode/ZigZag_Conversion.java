package Leetcode;

public class ZigZag_Conversion {
    public String convert(String s, int numRows) {
        if (numRows <= 1 || s.length() <= numRows) {
            return s; // No conversion needed
        }

        String[] ans = new String[numRows]; // Array for storing rows
        for (int i = 0; i < numRows; i++) {
            ans[i] = ""; // Initialize each row as an empty string
        }

        int i = 0;
        while (i < s.length()) {
            // Fill down the rows
            for (int index = 0; index < numRows && i < s.length(); index++) {
                ans[index] += s.charAt(i++);
            }
            // Fill up diagonally
            for (int index = numRows - 2; index > 0 && i < s.length(); index--) {
                ans[index] += s.charAt(i++);
            }
        }

        String res = "";
        for (String str : ans) { // Concatenate all rows
            res += str;
        }
        return res;
    }

    public static void main(String[] args) {
        ZigZag_Conversion solution = new ZigZag_Conversion();

        // Test cases
        String s1 = "PAYPALISHIRING";
        int numRows1 = 3;
        System.out.println("Input: " + s1 + ", numRows: " + numRows1);
        System.out.println("Output: " + solution.convert(s1, numRows1));

        String s2 = "HELLOZIGZAG";
        int numRows2 = 4;
        System.out.println("\nInput: " + s2 + ", numRows: " + numRows2);
        System.out.println("Output: " + solution.convert(s2, numRows2));

        String s3 = "ABCDEFGHI";
        int numRows3 = 2;
        System.out.println("\nInput: " + s3 + ", numRows: " + numRows3);
        System.out.println("Output: " + solution.convert(s3, numRows3));
    }
}

