package TCS;

import java.util.Arrays;

/*Given an Integer array Arr of size N the task is to find the count of elements whose value is
greater than all of its prior elements.

Note: 1st element of the Array should be considered in the count of the result.
 */
public class Numbers_of_Largest_Elements {
    public static void main(String[] args) {
        Numbers_of_Largest_Elements sol=new Numbers_of_Largest_Elements();
        int[] nums={7,4,8,2,9,9};
        System.out.println("Original Array: "+ Arrays.toString(nums));

        //System.out.println("Count of the Elements whose value is greater of its Prior Elements: ");
        System.out.println(sol(nums));

    }
    private static int sol(int[] nums){
        int n=nums.length-1;
        int count=1;
        for (int i=1;i<n;i++){
            boolean flag=true;
            for (int j=i-1;j>=0;j--){
                if(nums[j]>=nums[i]) {
                    flag=false;
                    break;
                }
            }
            if (flag==true){
                count++;
            }
        }
        return count;
    }
}
