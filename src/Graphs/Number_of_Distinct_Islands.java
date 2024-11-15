package Graphs;

import java.util.HashSet;
import java.util.Set;

public class Number_of_Distinct_Islands {

    public int numDistinctIslands(int[][] grid) {
        Set<String> set = new HashSet<>();

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] != 0) {
                    StringBuilder sb = new StringBuilder();
                    dfs(grid, i, j, sb, "o");
                    set.add(sb.toString());
                }
            }
        }
        return set.size();
    }

    void dfs(int[][] grid, int i, int j, StringBuilder sb, String dir) {
        if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0; // Mark as visited
        sb.append(dir);

        // Explore all directions
        dfs(grid, i + 1, j, sb, "r");
        dfs(grid, i - 1, j, sb, "l");
        dfs(grid, i, j + 1, sb, "d");
        dfs(grid, i, j - 1, sb, "u");

        sb.append("b"); // Append "back" to signify backtracking
    }

    public static void main(String[] args) {
        Number_of_Distinct_Islands solution = new Number_of_Distinct_Islands();

        int[][] grid = {
                {1, 1, 0, 0, 0},
                {1, 0, 0, 0, 0},
                {0, 0, 0, 1, 1},
                {0, 0, 0, 1, 1}
        };

        System.out.println("Number of distinct islands: " + solution.numDistinctIslands(grid));
    }
}
