package Leetcode;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Generate_Parantheses {
    // Main method to generate all combinations of valid parentheses
    public List<String> generateParenthesis(int n) {
        // Create a list to store the final results
        List<String> ans = new ArrayList<>();
        // Call the recursive helper function to generate combinations
        solve("", 0, 0, n, ans);
        return ans;
    }

    // Helper method to perform the recursive backtracking
    private void solve(String curr, int open, int closed, int total, List<String> ans) {
        // Base case: If the current string length is 2 * total, it's a valid combination
        if (curr.length() == 2 * total) {
            ans.add(curr); // Add the valid combination to the list
            return;
        }
        // If the number of open parentheses used is less than the total allowed
        if (open < total) {
            // Add an open parenthesis and recurse
            solve(curr + "(", open + 1, closed, total, ans);
        }
        // If the number of closed parentheses is less than the number of open ones
        if (closed < open) {
            // Add a closed parenthesis and recurse
            solve(curr + ")", open, closed + 1, total, ans);
        }
    }

    // Main method to test the implementation
    public static void main(String[] args) {
        Generate_Parantheses solution = new Generate_Parantheses();
        Scanner sc=new Scanner(System.in);
        // Test with n = 3
        int n = sc.nextInt();
        List<String> result = solution.generateParenthesis(n);

        // Print the generated combinations
        System.out.println("All combinations of valid parentheses for n = " + n + ":");
        for (String s : result) {
            System.out.println(s);
        }
    }
}
