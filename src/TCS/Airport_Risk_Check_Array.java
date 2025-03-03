package TCS;

import java.util.Arrays;

/*Airport Security officials have Confiscated several item of the Passengers at the Security Check Point.All the items have been
dumped into a huge box(array).Each item possesses a certain amount of risk[0,1,2].Here,the risk severity of the items represent
an array[] of N number of integer values.The task here is to sort the items based on their levels of risk in the array.The risk
values ranges from 0 to 2.
*/
//Dutch Flag Algorithm

public class Airport_Risk_Check_Array {
    public static void main(String[] args) {
        Airport_Risk_Check_Array sol=new Airport_Risk_Check_Array();
        int[] nums={2,1,0,2,0,1};
        System.out.println("Original Array: "+Arrays.toString(nums));

        int[] result=sol.Solution(nums);
        System.out.println("Array After Applying the Given Condition: "+Arrays.toString(result));
    }
    private static void swap(int[] nums,int i,int j){
        int temp=nums[i];
        nums[i]=nums[j];
        nums[j]=temp;
    }
    public static int[] Solution(int[] nums){
//        Arrays.sort(nums);
//        return nums;
        int n= nums.length;
        int start=0;
        int mid=0;
        int end=n-1;
        while (mid<=end){
            if(nums[mid]==0) {
                swap(nums,mid,start);
                start++;
                mid++;
            }else if(nums[mid]==1){
                mid++;
            }else{
                swap(nums,mid,end);
                end--;
            }
        }
//        for (int it:nums){
//            System.out.println(it+" ");
//        }
        return nums;
    }
}