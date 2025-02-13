package Leetcode;
import java.util.Arrays;

public class Running_Sum_Of_1D_Array {
    // Function to compute the running sum of an array
    public int[] runningSum(int[] nums) {
        // Iterate from the second element to the last element
        for (int i = 1; i < nums.length; i++) {
            nums[i] = nums[i] + nums[i - 1]; // Add the previous element to the current element
        }
        return nums; // Return the modified array
    }

    public static void main(String[] args) {
        Running_Sum_Of_1D_Array solution = new Running_Sum_Of_1D_Array();

        // Test input array
        int[] nums = {1, 2, 3, 4, 5};

        // Calling the function and storing the result
        int[] result = solution.runningSum(nums);

        // Printing the result
        System.out.println(Arrays.toString(result));
    }
}
