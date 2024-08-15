package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class MultiDimension_Arrays {
    public static void main(String[] args) {
        /*
            1 2 3
            4 5 6
            7 8 9
         */
        Scanner sc=new Scanner(System.in);
        int[][] arr=new int[3][];
        int[][] arr2D={
                {1,2,3},    //0th index
                {4,5},     //1st index
                {6,7,8,9}  //2nd index
        };

        int[][] arr1=new int[3][3];
        System.out.println(arr1.length);//no of rows
        //input
        for (int row=0;row<arr1.length;row++){
            //for each col in every row
            for (int col=0;col<arr1[row].length;col++){
                arr1[row][col]=sc.nextInt();
            }
        }
        //output
    //    for (int row=0;row<arr1.length;row++){
            //for each col in every row
            //for (int col=0;col<arr1[row].length;col++){
            //    System.out.print(arr1[row][col]+" ");
            //}
            //System.out.println();
    //        System.out.println(Arrays.toString(arr1[row]));
    //   }

        //enhanced for loop
        for (int[] a:arr1){
            System.out.println(Arrays.toString(a));
        }
    }
}
