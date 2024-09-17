package Leetcode;

public class Container_with_Most_Water {
    public static void main(String[] args) {
        int[] nums={1,8,6,2,5,4,8,3,7};
        System.out.println(Solution(nums));
    }
    public static int Solution(int[] nums){
        int water=0,left=0,right= nums.length-1;
        while(left<right){
            water=Math.max(water,Math.min(nums[left],nums[right])*(right-left));
            if (nums[left]>nums[right]) right--;
            else left++;
        }
        return water;
    }
}
