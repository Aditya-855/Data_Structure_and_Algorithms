package Leetcode;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums={2,2,1,1,1,2,2};
        System.out.println(ME(nums));
    }
    public static int ME(int[] nums){
        int candidate=0;
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (count==0){
                candidate=nums[i];
            }
            if (candidate==nums[i]){
                count++;
            }else {
                count--;
            }
        }
        return candidate;
    }
}
