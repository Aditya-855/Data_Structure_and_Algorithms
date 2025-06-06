package Leetcode;

import java.util.HashSet;

public class Minimum_Operations_To_Make_Array_Value_K {
    public int minOperations(int[] nums, int k) {
        HashSet<Integer> st = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int x = nums[i];
            if (x < k) {
                return -1;
            } else if (x > k) {
                st.add(x);
            }
        }
        // return count of unique elements
        return st.size();
    }

    public static void main(String[] args) {
        Minimum_Operations_To_Make_Array_Value_K sol = new Minimum_Operations_To_Make_Array_Value_K();

        int[] nums = {5, 7, 9, 6, 7}; // Example input
        int k = 5;

        int result = sol.minOperations(nums, k);
        System.out.println("Minimum operations: " + result);
    }
}
