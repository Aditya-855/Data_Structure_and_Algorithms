package Dynamic_Programming;

public class Longest_Common_Subsequence {
// A Naive recursive implementation of LCS problem
    // Returns length of LCS for s1[0..m-1], s2[0..n-1]
    static int lcsRec(String s1, String s2, int m, int n) {

        // Base case: If either string is empty, the length of LCS is 0
        if (m == 0 || n == 0)
            return 0;

        // If the last characters of both substrings match
        if (s1.charAt(m - 1) == s2.charAt(n - 1))

            // Include this character in LCS and recur for remaining substrings
            return 1 + lcsRec(s1, s2, m - 1, n - 1);

        else
            // If the last characters do not match
            // Recur for two cases:
            // 1. Exclude the last character of S1
            // 2. Exclude the last character of S2
            // Take the maximum of these two recursive calls
            return Math.max(lcsRec(s1, s2, m, n - 1), lcsRec(s1, s2, m - 1, n));
    }
    static int lcs(String s1,String s2){
        int m = s1.length(), n = s2.length();
        return lcsRec(s1,s2,m,n);
    }
    public static void main(String[] args) {
        String s1 = "abcd";
        String s2 = "bd";
        System.out.println(lcs(s1, s2));
    }
}
