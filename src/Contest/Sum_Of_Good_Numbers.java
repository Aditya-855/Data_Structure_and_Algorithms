package Contest;

public class Sum_Of_Good_Numbers {
    public static int sumOfGoodElements(int[] nums, int k) {
        int sum = 0;
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            boolean isGood = true;

            // Check if i-k is within bounds and nums[i] is not greater
            if (i - k >= 0 && nums[i] <= nums[i - k]) {
                isGood = false;
            }

            // Check if i+k is within bounds and nums[i] is not greater
            if (i + k < n && nums[i] <= nums[i + k]) {
                isGood = false;
            }

            if (isGood) {
                sum += nums[i];
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 1, 5, 4};
        int k = 2;
        System.out.println("Sum of Good Elements: " + sumOfGoodElements(nums, k)); // Output: 12
    }
}
