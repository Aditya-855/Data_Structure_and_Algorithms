package Leetcode;

import java.util.Arrays;

public class Maximum_Gap_Using_Bucket_Sort {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if (n < 2) return 0; // If there's only one element, no gap exists

        // Find min and max values in the array
        int minVal = Integer.MAX_VALUE, maxVal = Integer.MIN_VALUE;
        for (int num : nums) {
            minVal = Math.min(minVal, num);
            maxVal = Math.max(maxVal, num);
        }

        // If all elements are the same, max gap is 0
        if (minVal == maxVal) return 0;

        // Compute bucket size and number of buckets
        int bucketSize = Math.max(1, (maxVal - minVal) / (n - 1)); // Minimum bucket size should be 1
        int bucketCount = (maxVal - minVal) / bucketSize + 1; // Total buckets required

        // Initialize buckets
        int[] bucketMin = new int[bucketCount];
        int[] bucketMax = new int[bucketCount];
        Arrays.fill(bucketMin, Integer.MAX_VALUE);
        Arrays.fill(bucketMax, Integer.MIN_VALUE);
        boolean[] bucketFilled = new boolean[bucketCount];

        // Place elements in buckets
        for (int num : nums) {
            int bucketIndex = (num - minVal) / bucketSize; // Find bucket index
            bucketMin[bucketIndex] = Math.min(bucketMin[bucketIndex], num);
            bucketMax[bucketIndex] = Math.max(bucketMax[bucketIndex], num);
            bucketFilled[bucketIndex] = true;
        }

        // Find the maximum gap
        int maxGap = 0, prevMax = minVal;
        for (int i = 0; i < bucketCount; i++) {
            if (!bucketFilled[i]) continue; // Skip empty buckets

            maxGap = Math.max(maxGap, bucketMin[i] - prevMax); // Compare gap with previous max
            prevMax = bucketMax[i]; // Update previous max
        }

        return maxGap;
    }

    public static void main(String[] args) {
        Maximum_Gap_Using_Bucket_Sort solution = new Maximum_Gap_Using_Bucket_Sort();
        int[] nums = {1, 1, 1, 4, 4, 4};
        System.out.println("Maximum Gap: " + solution.maximumGap(nums)); // Output: 3
    }
}

