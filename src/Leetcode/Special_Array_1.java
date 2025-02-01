package Leetcode;

public class Special_Array_1 {
    public boolean isArraySpecial(int[] nums) {
        int n = nums.length;

        for (int i = 0; i < n - 1; i++) { // Fix the loop range to n-1
            if (nums[i] % 2 == nums[i + 1] % 2) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Special_Array_1 solution = new Special_Array_1();

        int[] nums1 = {1, 2, 3, 4, 5};
        System.out.println(solution.isArraySpecial(nums1));  // Output: true

        int[] nums2 = {2, 4, 6, 8};
        System.out.println(solution.isArraySpecial(nums2));  // Output: false

        int[] nums3 = {1, 3, 5, 7};
        System.out.println(solution.isArraySpecial(nums3));  // Output: false

        int[] nums4 = {1, 2, 3, 4, 6, 7};
        System.out.println(solution.isArraySpecial(nums4));  // Output: false
    }
}

