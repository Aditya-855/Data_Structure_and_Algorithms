package Leetcode;

public class Single_Number_2 {
    public static void main(String[] args) {
        int[] nums={1,5,5,1,7};
        System.out.println(Solution(nums));
    }
    public static int Solution(int[] nums){
        int result=0;
        for (int i=0;i<nums.length;i++){
            result=result^nums[i];
        }
        return result;
    }
}
