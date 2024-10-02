package Leetcode;
import java.util.HashMap;
import java.util.Map;

public class Contains_Duplicate_2 {
    public static void main(String[] args) {
        int[] nums={1,2,3,1};
        int k=3;
        System.out.println(containsNearbyDuplicate(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer,Integer> Hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(!Hm.containsKey(nums[i])){
                Hm.put(nums[i],i);
            }else{
                int PastIndex=Hm.get(nums[i]);
                if(Math.abs(PastIndex-i)<=k){  //past index-current index
                    return true;
                }else{
                    Hm.put(nums[i],i);
                }
            }
        }
        return false;
    }
}

