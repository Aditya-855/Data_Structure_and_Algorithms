package Training_HitbullsEye;

import java.util.Arrays;

public class Reverse_Of_Array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6};
        int i=0;
        int j= arr.length-1;
        int temp;
        while(j>i){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
