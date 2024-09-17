package Count_sort;

import java.util.Arrays;

public class Count_Sort {
    public static void main(String[] args) {
        int[] arr={6,3,10,9,2,4,9,7};
        countSort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void countSort(int[] arr){
       if (arr==null ||arr.length<=1){
           return;
       }
       int largest=arr[0];
       for (int num:arr){
           if (num>largest){
               largest=num;
           }
       }
       int[] countArray=new int[largest+1];
       for (int num:arr){
           countArray[num]++;
       }
       int index=0;
       for (int i=0;i<=largest;i++){
           while (countArray[i]>0){
               arr[index]=i;
               index++;
               countArray[i]--;
           }
       }
    }
}
