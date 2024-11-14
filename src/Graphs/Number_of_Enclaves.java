package Graphs;

public class Number_of_Enclaves {
    int rows, cols;

    public int numEnclaves(int[][] grid) {
        rows = grid.length;
        cols = grid[0].length;

        // Flood fill from the borders to mark all connected land cells (1s) as visited (0s)
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if ((i == 0 || j == 0 || i == rows - 1 || j == cols - 1) && (grid[i][j] == 1))
                    dfs(grid, i, j);
            }
        }

        // Count the remaining land cells (1s) which are enclosed by water (0s)
        int max_count = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 1)
                    max_count++;
            }
        }
        return max_count;
    }

    // Depth-first search to mark connected land cells as visited
    void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == 0) return;
        grid[i][j] = 0;

        dfs(grid, i + 1, j);
        dfs(grid, i - 1, j);
        dfs(grid, i, j + 1);
        dfs(grid, i, j - 1);
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0, 0, 0, 0},
                {1, 0, 1, 0},
                {0, 1, 1, 0},
                {0, 0, 0, 0}
        };
        Number_of_Enclaves ob = new Number_of_Enclaves();
        int ans = ob.numEnclaves(grid); // Corrected method name
        System.out.println(ans);
    }
}
