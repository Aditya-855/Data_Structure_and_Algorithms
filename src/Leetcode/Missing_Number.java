package Leetcode;

public class Missing_Number {
    public static void main(String[] args) {
        int [] arr={4,5,1,2,3,7,9,6};
        Missing(arr,9);
        System.out.println(Missing(arr,9));
    }
    static int Missing(int[] arr, int n){
        int sum=n*(n+1)/2;
        int sum2=0;
        for(int i=0;i<n-1;i++){
            sum2=sum2+arr[i];
        }
        return(sum-sum2);
    }
}
