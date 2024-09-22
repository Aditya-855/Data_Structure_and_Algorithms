package Leetcode;

public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,3,4};
        System.out.println(remveduplicates(nums));
    }
    public static int remveduplicates(int[] nums){
        int count=0;
        for(int i=1;i< nums.length;i++){
            if (i< nums.length-1 && nums[i]==nums[i+1]){
                continue;
            }
            else {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
