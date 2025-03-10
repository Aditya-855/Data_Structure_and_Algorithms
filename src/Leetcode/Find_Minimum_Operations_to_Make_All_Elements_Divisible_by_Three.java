package Leetcode;

public class Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three {
    public int minimumOperations(int[] nums) {
        int ans = 0;

        // Loop through each number in the array
        for (int i = 0; i < nums.length; i++) {
            // If the number is not divisible by 3, increase the count
            if (nums[i] % 3 != 0) {
                ans++;
            }
        }

        // Return the total count of numbers that are not divisible by 3
        return ans;
    }

    public static void main(String[] args) {
        Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three solution = new Find_Minimum_Operations_to_Make_All_Elements_Divisible_by_Three();

        int[] nums = {1, 2, 3, 4}; // Example input
        System.out.println("Minimum Operations: " + solution.minimumOperations(nums));
    }
}
