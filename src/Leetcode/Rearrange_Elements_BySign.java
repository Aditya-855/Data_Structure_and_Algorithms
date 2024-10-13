package Leetcode;

import java.util.Arrays;

public class Rearrange_Elements_BySign{
    public static void main(String[] args) {
        int[] nums={3,1,-2,-5,2,-4};
        System.out.println(Arrays.toString(rearrangeArray(nums)));
    }
    public static int[] rearrangeArray(int[] nums) {
        int result[]=new int[nums.length];
        int pIndex=0,nIndex=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){ //checking that the number is positive/negative
                result[pIndex]=nums[i];
                pIndex=pIndex+2;//increamenting positive index by 2 each time to accomodate next positive number
            }else{
                result[nIndex]=nums[i];
                nIndex=nIndex+2;//increamenting negative index by 2 each time to accomodate next negative number
            }
        }
        return result;
    }
}
