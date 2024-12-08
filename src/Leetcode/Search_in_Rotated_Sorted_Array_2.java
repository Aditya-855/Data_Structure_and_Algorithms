package Leetcode;

public class Search_in_Rotated_Sorted_Array_2 {
    public boolean search(int[] nums, int target) {
        int left = 0, right = nums.length - 1;

        // Continue the search as long as the pointers do not cross
        while (left <= right) {
            // Check if the target matches the current left or right element
            if (nums[left] == target || nums[right] == target) {
                return true;
            }

            // If the target is greater than nums[left], move left pointer forward
            if (target > nums[left]) {
                // Skip duplicates on the left
                while (left < right && nums[left] == nums[left + 1]) {
                    left++;
                }
                left++;
            }
            // If the target is less than nums[right], move right pointer backward
            else if (target < nums[right]) {
                // Skip duplicates on the right
                while (left < right && nums[right] == nums[right - 1]) {
                    right--;
                }
                right--;
            }
            // If the target does not meet any condition, break the loop
            else {
                break;
            }
        }

        // If the loop completes without finding the target, return false
        return false;
    }
    public static void main(String[] args) {
        Search_in_Rotated_Sorted_Array_2 solution = new Search_in_Rotated_Sorted_Array_2();

        // Example 1: Rotated sorted array with duplicates
        int[] nums1 = {2, 5, 6, 0, 0, 1, 2};
        int target1 = 0;
        System.out.println("Example 1: " + solution.search(nums1, target1)); // Output: true

        // Example 2: Target not in array
        int[] nums2 = {2, 5, 6, 0, 0, 1, 2};
        int target2 = 3;
        System.out.println("Example 2: " + solution.search(nums2, target2)); // Output: false

        // Example 3: Single element array
        int[] nums3 = {1};
        int target3 = 1;
        System.out.println("Example 3: " + solution.search(nums3, target3)); // Output: true

        // Example 4: Array with duplicates
        int[] nums4 = {1, 1, 3, 1};
        int target4 = 3;
        System.out.println("Example 4: " + solution.search(nums4, target4)); // Output: true

        // Example 5: Empty array
        int[] nums5 = {};
        int target5 = 5;
        System.out.println("Example 5: " + solution.search(nums5, target5)); // Output: false
    }
}
