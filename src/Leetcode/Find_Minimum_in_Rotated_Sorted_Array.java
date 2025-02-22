package Leetcode;

public class Find_Minimum_in_Rotated_Sorted_Array {
    public int findMin(int[] nums) {
        int n = nums.length;  // Get the length of the array
        int left = 0;  // Initialize left pointer
        int right = n - 1;  // Initialize right pointer

        // Perform binary search
        while (left < right) {
            int mid = left + (right - left) / 2;  // Calculate middle index to avoid overflow

            // If mid element is smaller than the rightmost element, the minimum is in the left half
            if (nums[mid] < nums[right]) {
                right = mid;  // Move the right pointer to mid
            } else {
                // The minimum is in the right half, so move left pointer to mid + 1
                left = mid + 1;
            }
        }

        // After the loop, left will be pointing to the minimum element
        return nums[left];
    }

    public static void main(String[] args) {
        Find_Minimum_in_Rotated_Sorted_Array solution = new Find_Minimum_in_Rotated_Sorted_Array();

        // Test cases
        int[] nums1 = {4, 5, 6, 7, 1, 2, 3}; // Rotated sorted array
        int[] nums2 = {3, 4, 5, 1, 2};  // Another rotation
        int[] nums3 = {1, 2, 3, 4, 5};  // Already sorted (no rotation)
        int[] nums4 = {2, 1};  // Only two elements
        int[] nums5 = {10};  // Single element array

        // Printing results
        System.out.println("Minimum in nums1: " + solution.findMin(nums1)); // Expected: 1
        System.out.println("Minimum in nums2: " + solution.findMin(nums2)); // Expected: 1
        System.out.println("Minimum in nums3: " + solution.findMin(nums3)); // Expected: 1
        System.out.println("Minimum in nums4: " + solution.findMin(nums4)); // Expected: 1
        System.out.println("Minimum in nums5: " + solution.findMin(nums5)); // Expected: 10
    }
}
