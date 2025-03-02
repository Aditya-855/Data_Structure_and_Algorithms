package TCS;

import java.util.Arrays;

/*Given a Sorted Array a[] of size n delete all the duplicated elements from a[] & modify the array
such that only distinct elements should be present there.

Note:
1.Don't use set or HashMap to Solve the Problem
2.You must return the modified array size where only distinct elements are present in the array,the driver
code will print all the elements of the modified array.
 */
public class Remove_Duplicates {
    public static void main(String[] args) {
        int[] nums={1,1,2,2,2,4,4};
        System.out.println("Original Array: "+ Arrays.toString(nums));
        System.out.println("Number Of Distinct Elements in the Array is:"+solution(nums));
    }
    public static int solution(int[] nums){
        int count=0;
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(i<n-1 && nums[i]==nums[i+1]){
                continue;
            }else{
                nums[count]=nums[i];
                count++;
            }
        }
        return count;
    }
}
