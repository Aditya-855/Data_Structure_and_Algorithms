package Leetcode;

import java.util.*;

public class Find_the_Number_of_Distinct_Colors_Among_the_Balls {
    public int[] queryResults(int limit, int[][] queries) {
        int n = queries.length;
        int[] result = new int[n];

        // Map to track the current color of each ball
        Map<Integer, Integer> ballmp = new HashMap<>();

        // Map to track the count of each color
        Map<Integer, Integer> colormp = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int ball = queries[i][0];  // Extract ball number
            int color = queries[i][1]; // Extract color number

            // If the ball already has a color, decrease the count of that color
            if (ballmp.containsKey(ball)) {
                int prevColor = ballmp.get(ball);
                colormp.put(prevColor, colormp.get(prevColor) - 1);

                // If no ball has this color anymore, remove it from the map
                if (colormp.get(prevColor) == 0) {
                    colormp.remove(prevColor);
                }
            }

            // Assign the new color to the ball
            ballmp.put(ball, color);
            // Update the color frequency map
            colormp.put(color, colormp.getOrDefault(color, 0) + 1);

            // Store the current number of distinct colors in the result array
            result[i] = colormp.size();
        }
        return result;
    }

    public static void main(String[] args) {
        Find_the_Number_of_Distinct_Colors_Among_the_Balls solution = new Find_the_Number_of_Distinct_Colors_Among_the_Balls();

        // Define test input
        int limit = 5; // (not used in the function, but provided as part of input format)
        int[][] queries = {
                {1, 2}, // Ball 1 is colored 2
                {2, 3}, // Ball 2 is colored 3
                {1, 3}, // Ball 1 is re-colored to 3
                {3, 2}, // Ball 3 is colored 2
                {2, 2}  // Ball 2 is re-colored to 2
        };

        // Call the function
        int[] result = solution.queryResults(limit, queries);

        // Print the result
        System.out.println(Arrays.toString(result));
    }
}
