//package Leetcode.Dynamic_Programming;
//
//public class Jump_Game_2 {
//    public static void main(String[] args) {
//        int[] nums={2,3,1,1,4};
//        System.out.println(canJump(nums));
//    }
//    public static int canJump(int[] nums){
//        int maxIndex = 0;
//        for (int i = 0; i < nums.length; i++) {
//        if (i > maxIndex) {
//            return i;
//        }
//        maxIndex = Math.max(maxIndex, i + nums[i]);
//    }
//        return ;
//    }
//}
