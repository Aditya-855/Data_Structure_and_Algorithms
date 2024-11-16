package Graphs;

public class Contains_Cycle {
    public boolean containsCycle(char[][] grid) {
        int rows = grid.length;
        int cols = grid[0].length;
        boolean[][] visited = new boolean[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (!visited[i][j]) {
                    if (dfs(grid, i, j, -1, -1, visited)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    private boolean dfs(char[][] grid, int i, int j, int pi, int pj, boolean[][] visited) {
        visited[i][j] = true;

        int[][] directions = {
                {i + 1, j}, // Down
                {i - 1, j}, // Up
                {i, j + 1}, // Right
                {i, j - 1}  // Left
        };

        for (int[] dir : directions) {
            int ni = dir[0];
            int nj = dir[1];

            if (ni >= 0 && ni < grid.length && nj >= 0 && nj < grid[0].length) {
                if (grid[ni][nj] == grid[i][j]) {
                    if (ni == pi && nj == pj) continue;

                    if (visited[ni][nj]) return true;

                    if (dfs(grid, ni, nj, i, j, visited)) return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Contains_Cycle solution = new Contains_Cycle();

        // Example grid with a cycle
        char[][] grid1 = {
                {'a', 'a', 'a', 'a'},
                {'a', 'b', 'b', 'a'},
                {'a', 'b', 'a', 'a'},
                {'a', 'a', 'a', 'a'}
        };

        // Example grid without a cycle
        char[][] grid2 = {
                {'a', 'b', 'b'},
                {'b', 'z', 'b'},
                {'b', 'b', 'a'}
        };

        System.out.println("Grid 1 contains cycle: " + solution.containsCycle(grid1)); // Output: true
        System.out.println("Grid 2 contains cycle: " + solution.containsCycle(grid2)); // Output: false
    }
}
