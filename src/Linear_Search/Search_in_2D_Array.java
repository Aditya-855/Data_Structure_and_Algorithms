package Linear_Search;

import java.util.Arrays;

public class Search_in_2D_Array {
    public static void main(String[] args) {
        int[][] arr={
                {23,4,1},
                {18,12,3,9},
                {78,99,34,56},
                {18,12}
        };
        int target=56;
        int[] ans=search(arr,target);//format of return value {row, col}
        System.out.println(Arrays.toString(ans));
        System.out.println(max(arr));
        System.out.println(Integer.MIN_VALUE);
    }
    static int[] search(int[][] arr, int target){
        for (int row=0;row<arr.length;row++){
            for (int col=0;col<arr[row].length;col++){
                if (arr[row][col]==target){
                    return new int[]{row,col};
                }
            }
        }
        return new int[]{-1,-1};
    }

//    static int max(int[][] arr){
//        int max=Integer.MIN_VALUE;
//        for (int row=0;row<arr.length;row++){
//            for (int col=0;col<arr[row].length;col++){
//                if (arr[row][col]>max){
//                   max=arr[row][col];
//                }
//            }
//        }
//        return max;
//    }

    static int max(int[][] arr){
        int max=Integer.MIN_VALUE;
        for (int[] ints : arr) {
            for (int element : ints) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }
}
