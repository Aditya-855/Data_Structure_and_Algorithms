package Leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class Merge_Intervals {
    public int[][] merge(int[][] intervals) {
        // Sort intervals based on their start times
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        // Use a List to store merged intervals
        List<int[]> merged = new ArrayList<>();

        for (int[] interval : intervals) {
            // If the list is empty or there's no overlap, add the interval
            if (merged.isEmpty() || merged.get(merged.size() - 1)[1] < interval[0]) {
                merged.add(interval);
            } else {
                // Merge intervals
                merged.get(merged.size() - 1)[1] = Math.max(merged.get(merged.size() - 1)[1], interval[1]);
            }
        }

        // Convert List to int[][]
        return merged.toArray(new int[merged.size()][]);
    }

    public static void main(String[] args) {
        Merge_Intervals solution = new Merge_Intervals();

        // Example input
        int[][] intervals = {
                {1, 3},
                {2, 6},
                {8, 10},
                {15, 18}
        };

        // Calling the merge function
        int[][] result = solution.merge(intervals);

        // Printing the result
        System.out.println("Merged Intervals:");
        for (int[] interval : result) {
            System.out.println(Arrays.toString(interval));
        }
    }
}
