package Leetcode;

public class Merge_Sorted_Array {
    public static void main(String[] args) {
        int[] nums1={1,2,3,0,0,0};
        int[] nums2={2,3,5};
        int m=3;int n=3;
        merger( nums1, m, nums2,n);
        for (int i=0;i<m+n;i++){
            System.out.print(nums1[i]+" ");
        }
    }
    public static void merger(int[] nums1,int m,int[] nums2,int n){
        int i=m-1;
        int j=n-1;
        int k=m+n-1;
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
    }
}
