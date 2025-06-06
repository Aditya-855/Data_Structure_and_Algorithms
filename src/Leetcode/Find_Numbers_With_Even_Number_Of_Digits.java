package Leetcode;

public class Find_Numbers_With_Even_Number_Of_Digits {
    public static void main(String[] args){
        int[] nums={12,345,2,6,786};
        System.out.println(findNumbers(nums));
    }
    public static int findNumbers(int[] nums){
        int n=nums.length;
        int count=0;
        for(int i=0;i<n;i++){
            if(nums[i]>9 && nums[i]<100 || (nums[i]>999 && nums[i]<10000) || nums[i]==100000){
                count++;
            }
        }
        return count;
    }
}