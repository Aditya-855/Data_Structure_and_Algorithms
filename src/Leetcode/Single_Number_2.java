package Leetcode;
import java.util.Arrays;
public class Single_Number_2 {
    public int singleNumber(int[] nums) {
        int ans = 0;  // Result to store the single number

        // Loop through each bit position (0 to 31 for a 32-bit integer)
        for (int i = 0; i < 32; i++) {
            int sum = 0;  // Count of bits set at the i-th position across all numbers

            // Iterate through all numbers in the array
            for (int j = 0; j < nums.length; j++) {
                // Check if the i-th bit is set in nums[j]
                if (((nums[j] >> i) & 1) == 1) {
                    sum++;
                }
            }

            // Only retain the bit if its count is not divisible by 3
            sum %= 3;

            // Set the i-th bit of the result if sum is not 0
            if (sum != 0) {
                ans |= sum << i;
            }
        }

        return ans;  // Return the single number
    }

    public static void main(String[] args) {
        Single_Number_2 solution = new Single_Number_2();

        // Test case: All numbers except one appear three times
        int[] nums = {2, 2, 3, 2};

        // Output the single number
        System.out.println("The single number is: " + solution.singleNumber(nums));
    }
}
