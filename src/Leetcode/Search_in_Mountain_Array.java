package Leetcode;

public class Search_in_Mountain_Array {
    public static void main(String[] args) {
        int [] arr={9,10,11,12,8,6,5};
        int target=11;
        int ans=orderAgnosticBS(arr,target,0,arr.length);
        System.out.println(ans);
    }
    int search(int[] arr,int target){
            int peak=peakIndexInMountainArray(arr);
            int firstTry=orderAgnosticBS(arr,target,0,peak);
            if (firstTry!=-1){
                return firstTry;
            }
            //try to search in the second half
        return orderAgnosticBS(arr,target,peak+1,arr.length-1);

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
    static int orderAgnosticBS(int[] arr,int target,int start,int end){

        //find whether the array is sorted im ascending or descending
        boolean isAsc=arr[start] < arr[end];
        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2; might be possible that (start+end) exceed the range
            int mid=start + (end - start ) /2;

            if (arr[mid]==target){
                return mid;
            }
            if (isAsc){
                if (target<arr[mid]){
                    end=mid-1;
                } else{
                    start=mid+1;
                }
            }else {
                if (target>arr[mid]){
                    end=mid-1;
                } else {
                    start=mid+1;
                }
            }
        }
        return -1;
    }
}
