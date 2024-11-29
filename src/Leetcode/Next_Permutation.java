package Leetcode;
import java.util.Arrays;

class Next_Permutation {
    public void nextPermutation(int[] nums) {
        int n = nums.length;

        // First, find the "blue circle" index
        int index = -1;//setting the index as none

        for (int i = n - 1; i > 0; i--) {//traversing from back side
            if (nums[i] > nums[i - 1]) {
                index = i - 1;//if condition satisfy then we assign the index value
                break;
            }
        }

        if (index != -1) {
            int swapIndex = index;
            for (int j = n - 1; j >= index + 1; j--) {
                if (nums[j] > nums[index]) {
                    swapIndex = j;
                    break;
                }
            }
            // Swap nums[index] and nums[swapIndex]
            int temp = nums[index];
            nums[index] = nums[swapIndex];
            nums[swapIndex] = temp;
        }

        // Reverse the elements from index + 1 to the end of the array
        reverse(nums, index + 1, n - 1);
    }

    private void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Next_Permutation solution = new Next_Permutation();

        // Example test case
        int[] nums = {1, 2, 3};
        System.out.println("Original array: " + Arrays.toString(nums));

        solution.nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));

        // Another test case
        nums = new int[]{3, 2, 1};
        System.out.println("\nOriginal array: " + Arrays.toString(nums));

        solution.nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));

        // Yet another test case
        nums = new int[]{1, 1, 5};
        System.out.println("\nOriginal array: " + Arrays.toString(nums));

        solution.nextPermutation(nums);
        System.out.println("Next permutation: " + Arrays.toString(nums));
    }
}
