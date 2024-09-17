package Binary_Search_in_2D_Array;

import java.util.Arrays;

public class Search_in_Sorted_Matrix {
    public static void main(String[] args) {
        int[][] arr={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        System.out.println(Arrays.toString(search(arr,9)));
    }
    //search in the row provided
    static int[] binarySearch(int[][] matrix,int row,int colStart,int colEnd,int target){
        while(colStart<=colEnd){
            int mid=colStart+(colEnd-colStart)/2;
            if (matrix[row][mid]==target){
                return new int[]{row,mid};
            }
            if(matrix[row][mid]<target){
                colStart=mid+1;
            }else{
                colEnd=mid-1;
            }
        }
        return new int[]{-1,-1};
    }
    static int[] search(int[][] matrix,int target){
        int row=matrix.length;
        int col=matrix[0].length; //be cautions,matrix may be empty

        if (row==1){
            return binarySearch(matrix,0,0,col-1,target);
        }

        int rStart=0;
        int rEnd=row-1;
        int cMid=col/2;
        //run the loop till 2 row are remaining
        while (rStart<(rEnd-1)){ //while this is true it will have more than two rows
            int mid=rStart+(rEnd-rStart)/2;
            if (matrix[mid][cMid]==target){
                return new int[]{mid,cMid};
            }if (matrix[mid][cMid]<target){
                rStart=mid;
            }else{
                rEnd=mid;
            }
        }
        //now we have two rows
        //check whether the target is in the column of 2 rows
        if (matrix[rStart][cMid]==target){
            return new int[]{rStart+1,cMid};
        }
        //search in first half
        if(target<=matrix[rStart][cMid-1]){
            return binarySearch(matrix,rStart,0,cMid-1,target);
        }
        //search in second half
        if(target>=matrix[rStart][cMid+1] && target<=matrix[rStart][cMid+1]){
            return binarySearch(matrix,rStart,cMid+1,col-1,target);
        }
        //search in third half
        if(target<=matrix[rStart+1][cMid-1]){
            return binarySearch(matrix,rStart+1,0,cMid-1,target);
        }
        //search in fourth half
        else{
            return binarySearch(matrix,rStart+1,cMid+1,col-1,target);
        }

    }
}
