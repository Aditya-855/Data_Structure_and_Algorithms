package Leetcode;
import java.util.*;
public class Trapping_Rain_Water {
    // Method to compute the left max array
    public int[] getLeftMaxArray(int[] height, int n) {
        int[] leftMax = new int[n];
        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }
        return leftMax;
    }

    // Method to compute the right max array
    public int[] getRightMaxArray(int[] height, int n) {
        int[] rightMax = new int[n];
        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }
        return rightMax;
    }

    // Main method to calculate trapped rain water
    public int trap(int[] height) {
        int n = height.length;
        if (n == 0) return 0; // Edge case: Empty array

        int[] leftMax = getLeftMaxArray(height, n);
        int[] rightMax = getRightMaxArray(height, n);

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int h = Math.min(leftMax[i], rightMax[i]) - height[i];
            sum += h;
        }
        return sum;
    }

    public static void main(String[] args) {
        Trapping_Rain_Water solution = new Trapping_Rain_Water();
        int[] height = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped Rain Water: " + solution.trap(height)); // Output: 6
    }
}
