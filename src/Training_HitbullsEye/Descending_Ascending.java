package Training_HitbullsEye;

import java.util.Arrays;

public class Descending_Ascending {
    public static void main(String[] args) {
        int[] arr={1,2,3,8,7,6};
        int n= arr.length;
        int temp;
        int mid=n/2;
        for(int i=0;i<mid;i++){
            for (int j=i+1;j<mid;j++){
                if (arr[i]<arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for (int i=mid;i<n-1;i++){
            for (int j=i+1;j<n;j++){
                if (arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
