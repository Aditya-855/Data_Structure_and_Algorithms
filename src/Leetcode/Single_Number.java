package Leetcode;

public class Single_Number {
    public static void main(String[] args) {
        int[] nums={2,2,3};
        System.out.println(Solution(nums));
    }
    public static int Solution(int[] nums){
        int element=0;
        for (int i=0;i<nums.length;i++){
            element=element^nums[i];
        }
        return element;
    }
}
