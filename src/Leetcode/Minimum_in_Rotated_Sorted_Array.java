package Leetcode;
import java.util.Arrays;
public class Minimum_in_Rotated_Sorted_Array {
    public static void main(String[] args) {
        int[] nums={3,4,5,1,2};
        System.out.println(findMin(nums));

    }
        public static int findMin(int[] nums) {
            Arrays.sort(nums);
            //return nums[0];
            int s=0;
            int e=nums.length-1;
            int min=nums[0];
            while(s<e){
                int m=(s+e)/2;
                if(min<nums[m]){
                    e=m;
                }
            }
            return e;
        }
    }
