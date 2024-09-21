package Leetcode;

import java.util.Arrays;
import java.util.HashMap;

public class Two_Sum {
    public static void main(String[] args) {
        int[] arr={2,7,11,15};
        int target=9;
        System.out.println(Arrays.toString(twoSum(arr,target)));
    }
    public static int[] twoSum(int[] arr,int target){
        HashMap<Integer,Integer> Hm=new HashMap<>();
        for(int i=0;i< arr.length;i++){
            int req_no=target-arr[i];
            if(Hm.containsKey(req_no)){
                int[] nums={Hm.get(req_no),i};
                return nums;
            }
            Hm.put(arr[i],i);
        }
        return null;
    }
}
