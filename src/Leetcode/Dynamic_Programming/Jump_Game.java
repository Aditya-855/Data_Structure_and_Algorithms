package Leetcode.Dynamic_Programming;

public class Jump_Game{
    public static void main(String[] args) {
        int[] nums={2,3,1,1,4};
        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int n=nums.length;
        if(n==1) return true;

        int max=0;

        for(int i=0;i<n-1 && max>=i;i++){
            if(max<i+nums[i]){
                max=i+nums[i];
            }
            if(max>=n-1) return true;
        }
        return false;
    }
//    int maxIndex = 0;
//
//    // Iterate through each
//    // index of the array
//        for (int i = 0; i < nums.length; i++) {
//        // If the current index is greater
//        // than the maximum reachable index
//        // it means we cannot move forward
//        // and should return false
//        if (i > maxIndex) {
//            return false;
//        }
//
//        // Update the maximum index
//        // that can be reached by comparing
//        // the current maxIndex with the sum of
//        // the current index and the
//        // maximum jump from that index
//        maxIndex = Math.max(maxIndex, i + nums[i]);
//    }
//
//    // If we complete the loop,
//    // it means we can reach the
//    // last index
//        return true;
//}

}
