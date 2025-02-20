package Leetcode;

public class Find_Unique_Binary_String {
    public String findDifferentBinaryString(String[] nums) {
        int n = nums.length; // Get the number of binary strings
        StringBuilder result = new StringBuilder();

        // Iterate through each index i from 0 to n-1
        for (int i = 0; i < n; i++) {
            // Flip the diagonal element: if '0' change to '1', if '1' change to '0'
            result.append(nums[i].charAt(i) == '0' ? '1' : '0');
        }

        return result.toString(); // Return the unique binary string
    }

    // Main method to test the function
    public static void main(String[] args) {
        Find_Unique_Binary_String sol = new Find_Unique_Binary_String();
        String[] nums = {"111","011","001"}; // Example input: an array of binary strings
        String uniqueBinary = sol.findDifferentBinaryString(nums);

        System.out.println("Unique Binary String: " + uniqueBinary);
    }
}
