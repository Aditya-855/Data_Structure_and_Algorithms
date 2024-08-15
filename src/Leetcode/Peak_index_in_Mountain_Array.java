package Leetcode;

public class Peak_index_in_Mountain_Array {
    public static void main(String[] args) {

    }
    public int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end=arr.length-1;

        while(start<end){
            int mid=start + (end - start ) /2;
            if (arr[mid] > arr[mid+1]){
                //you are in the decreasing part of the array
                //this may be the ans, but look at left
                //this is why end ! =mid - 1
                end=mid;
            }else{
                //you are in the asc part of array
                start=mid+1; //bcz we know that mid + 1 > mid element
            }
        }
        //in the end , start == end and pointing to the largest number bcz of the 2 checks above
        //start and end are trying to find max element in the above 2 checks
        //hence when they are pointing
        return start;
    }
}
