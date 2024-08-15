package Leetcode;

public class Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        int [] arr={-18,-12,-4,0,2,3,4,15,16,18,22,45,89};
        int target=17;
        int ans= smallestGreaterThanTarget(arr,target);
        System.out.println(ans);
    }
    //return the index of smallest no >= target
    static int smallestGreaterThanTarget(int[] arr, int target){

        //but what if the target is greater than the greatest number in the array
        if (target > arr[arr.length - 1]){
            return  -1;
        }
        int start=0;
        int end=arr.length-1;
        while(start<=end){
            //find the middle element
            //int mid=(start+end)/2; might be possible that (start+end) exceed the range
            int mid=start + (end - start ) /2;

            if (target<arr[mid]){
                end=mid-1;
            } else {
                start=mid + 1;
            }
        }
        return arr[start]; //this is to return the value on the index
    }
}
