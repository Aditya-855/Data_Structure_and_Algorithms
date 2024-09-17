package Leetcode;

import com.sun.tools.javac.Main;

public class Max_Consecutive_Ones {
    public static void main(String[] args) {
        int[] nums = {1,1,0,1,1,1};
        //findMaxConsecutiveOnes(nums);
        System.out.println(findMaxConsecutiveOnes(nums));

    }
    static int findMaxConsecutiveOnes(int[] nums) {
        int maxi=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                maxi=Math.max(maxi,count);
            }else{
                count=0;
            }
        }
        return maxi;
    }
}
