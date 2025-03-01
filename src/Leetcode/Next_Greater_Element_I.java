package Leetcode;

import java.util.Arrays; // Import Arrays class for printing results

public class Next_Greater_Element_I {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length; // Length of nums1
        int m = nums2.length; // Length of nums2
        int[] result = new int[n]; // Result array to store answers

        // Step 1: Iterate through each element in nums1
        for (int i = 0; i < n; i++) {
            result[i] = -1; // Default value (if no greater element is found)

            // Step 2: Find nums1[i] in nums2
            for (int j = 0; j < m; j++) {
                if (nums1[i] == nums2[j]) { // Found nums1[i] in nums2

                    // Step 3: Look for the next greater element in nums2
                    for (int k = j + 1; k < m; k++) {
                        if (nums2[k] > nums2[j]) { // Found next greater element
                            result[i] = nums2[k];
                            break; // Stop searching after finding the first greater element
                        }
                    }
                    break; // Stop searching once nums1[i] is found in nums2
                }
            }
        }
        return result; // Return the final result array
    }

    // Main method to test the function
    public static void main(String[] args) {
        Next_Greater_Element_I solution = new Next_Greater_Element_I(); // Create an instance of Solution

        // Test cases
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};
        System.out.println("Next Greater Elements: " + Arrays.toString(solution.nextGreaterElement(nums1, nums2)));
        // Expected Output: [-1, 3, -1]

        int[] nums3 = {2, 4};
        int[] nums4 = {1, 2, 3, 4};
        System.out.println("Next Greater Elements: " + Arrays.toString(solution.nextGreaterElement(nums3, nums4)));
        // Expected Output: [3, -1]
    }
}

