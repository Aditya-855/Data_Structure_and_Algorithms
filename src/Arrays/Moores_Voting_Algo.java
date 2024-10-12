package Arrays;

public class Moores_Voting_Algo {
    public static void main(String[] args) {
        int nums[]={1,2,2,1,2,1,1};
        System.out.println(algo(nums));
    }
    public static int algo(int[] nums ){
        int candidate=0;
        int count=0;
        for (int i=0;i<nums.length;i++){
            if (count==0){
                candidate=nums[i];
            }
            if (candidate==nums[i]){
                count++;
            }else{
                count--;
            }
        }
        return candidate;
    }
}
