package Leetcode;
import java.util.ArrayList;
public class Intersection_Of_Two_Array_2 {
    public int[] intersect(int[] nums1, int[] nums2) {
        // Create an array to store the frequency of numbers in nums1.
        int Freqarr[] = new int[1001];

        // Calculate the frequency of each number in nums1.
        for (int num : nums1) {
            Freqarr[num]++;
        }

        // Create a list to store the intersection of the two arrays.
        ArrayList<Integer> list = new ArrayList<>();

        // Iterate through nums2 and check if the number is in nums1.
        for (int num : nums2) {
            if (Freqarr[num] > 0) { // If the number exists in nums1 (frequency > 0),
                list.add(num);      // add it to the intersection list.
                Freqarr[num]--;     // Decrease the frequency to avoid duplicates.
            }
        }

        // Convert the ArrayList to an integer array to match the method's return type.
        int k = list.size(); // Get the size of the list.
        int result[] = new int[k]; // Create an array of the same size.
        for (int i = 0; i < k; i++) {
            result[i] = list.get(i); // Copy elements from the list to the array.
        }

        return result; // Return the resulting intersection array.
    }

    public static void main(String[] args) {
        Intersection_Of_Two_Array_2 solution = new Intersection_Of_Two_Array_2();

        // Example input arrays
        int[] nums1 = {1, 2, 2, 1};
        int[] nums2 = {2, 2};

        // Call the intersect method and store the result
        int[] result = solution.intersect(nums1, nums2);

        // Print the result
        System.out.print("Intersection: ");
        for (int num : result) {
            System.out.print(num + " ");
        }
    }
}
