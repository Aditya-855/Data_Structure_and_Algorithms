package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Insert_Intervals {
    // Method to insert a new interval into a list of sorted, non-overlapping intervals
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int[]> list = new ArrayList<>();
        boolean inserted = false; // Track if the new interval has been inserted

        // Iterate through the intervals
        for (int[] i : intervals) {
            // Insert the new interval at the correct position if it hasn't been added yet
            if (i[0] > newInterval[0] && !inserted) {
                list.add(newInterval);
                inserted = true;
            }
            // Add the current interval to the list
            list.add(i);
        }

        // If the new interval was not added (e.g., it belongs at the end), add it
        if (list.size() == intervals.length) list.add(newInterval);

        // Merge the intervals and return the result
        return solve(list);
    }

    // Method to merge overlapping intervals in a list
    public int[][] solve(List<int[]> intervals) {
        List<int[]> res = new ArrayList<>();
        int start = intervals.get(0)[0]; // Start of the current interval
        int end = intervals.get(0)[1];   // End of the current interval

        // Iterate through the intervals starting from the second one
        for (int i = 1; i < intervals.size(); i++) {
            // Check if the current interval overlaps with the previous one
            if (intervals.get(i)[0] <= end) {
                // Extend the end of the interval if they overlap
                end = Math.max(intervals.get(i)[1], end);
            } else {
                // If no overlap, add the completed interval to the result
                res.add(new int[]{start, end});
                // Start a new interval
                start = intervals.get(i)[0];
                end = intervals.get(i)[1];
            }
        }

        // Add the last interval to the result
        res.add(new int[]{start, end});

        // Convert the result list to a 2D array
        int[][] ans = new int[res.size()][2];
        for (int i = 0; i < res.size(); i++) {
            ans[i][0] = res.get(i)[0];
            ans[i][1] = res.get(i)[1];
        }
        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {
        Insert_Intervals solution = new Insert_Intervals();

        // Test input: intervals and newInterval
        int[][] intervals = {{1, 3}, {6, 9}};
        int[] newInterval = {2, 5};

        // Call the insert method and print the result
        int[][] result = solution.insert(intervals, newInterval);
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println("[" + interval[0] + ", " + interval[1] + "]");
        }
    }
}
