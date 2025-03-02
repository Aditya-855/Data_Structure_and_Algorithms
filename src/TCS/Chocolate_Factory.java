package TCS;

/*A Chocolate factory is Packing Chocolate into the Packets. The Chocolate Packets here represent an array of N Number
of integer values. The task is to find the empty packets(0) of chocolate and push it to the end of the conveyor
belt(array).
 */

import java.util.Arrays;

public class Chocolate_Factory {
    public static void main(String[] args) {
        Chocolate_Factory sol=new Chocolate_Factory();
        int[] nums={4,5,0,1,9,0,5,0};
        System.out.println("Original Array: "+Arrays.toString(nums));

        int[] result=sol.Solution(nums);
        System.out.println("Resultant Array: "+Arrays.toString(result));
    }
    public int[] Solution(int[] nums){
        int n=nums.length;
        int notZero=0;
        for(int i=0;i<n;i++){
            if(nums[i]!=0){
                nums[notZero++]=nums[i];
            }
        }
        while(notZero<n){
            nums[notZero++]=0;
        }
        return nums;
    }
}