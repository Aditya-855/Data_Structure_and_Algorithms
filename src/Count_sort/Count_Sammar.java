package Count_sort;

import java.util.Arrays;

public class Count_Sammar {
    public static void main(String[] args) {
        int[] arr={4,6,0,3,5,4,3};
        Count(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void Count(int[] arr){
        int max=6;
        int[] frequency=new int[max+1];
        for(int i=0;i<arr.length;i++){
            frequency[arr[i]]++;
        }
        int index=0;
        for (int i=0;i< frequency.length;i++){
            while(frequency[i]>0){
                arr[index]=i;
                index++;
                frequency[i]--;
            }
        }
    }
}
