package Training_HitbullsEye;

import java.util.Arrays;

public class Longest_Consequtive_Sequence {
    public static void main(String[] args) {
        int[] nums = {0,3,7,2,5,8,4,6,0,1};
        int n=nums.length;
        Arrays.sort(nums);
        int maxCount = 1;
        int count = 1;
        if(n==0){
            System.out.println("0");
        }
        for (int i = 1; i < n; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            } else if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            maxCount = Math.max(maxCount, count);
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(maxCount);
    }
}
