package Leetcode;

public class Find_Peak_Element {
    public int findPeakElement(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2; // Calculate mid to avoid integer overflow

            // If mid element is greater than the next element, move towards left (peak is at mid or before)
            if (nums[mid] > nums[mid + 1]) {
                end = mid; // Move left
            } else {
                start = mid + 1; // Move right
            }
        }
        return start; // 'start' will be the peak index
    }

    public static void main(String[] args) {
        Find_Peak_Element solution = new Find_Peak_Element();

        int[] nums = {1, 2, 3, 1}; // Example input array
        int peakIndex = solution.findPeakElement(nums);

        System.out.println("Peak Element Index: " + peakIndex);
        System.out.println("Peak Element Value: " + nums[peakIndex]);
    }
}
