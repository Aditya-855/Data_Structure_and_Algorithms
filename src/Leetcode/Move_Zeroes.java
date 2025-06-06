package Leetcode;

import java.util.Arrays;

public class Move_Zeroes {
    public static void main(String[] args) {
        int[] nums = {0, 1, 3, 0, 12};

        // Move zeroes and return the modified array
        int[] result = moveZeros(nums);

        // Print the modified array
        System.out.println(Arrays.toString(result));
    }

    public static int[] moveZeros(int[] nums) {
        int count = 0;// Keep track of non-zero elements

        // Move non-zero elements to the front
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0)
                count++;
        }

        // Fill remaining positions with zeroes
        while (count < nums.length) {
            nums[count++] = 0;
        }

        // Return the modified array
        return nums;
    }
}
