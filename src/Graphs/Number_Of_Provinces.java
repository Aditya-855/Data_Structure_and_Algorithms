package Graphs;

import javax.swing.*;
import java.util.ArrayList;

public class Number_Of_Provinces {
// Class to find the number of connected components in a graph represented as an adjacency matrix.
    private int n; // Number of nodes in the graph

    /**
     * Depth-First Search (DFS) to traverse all connected nodes.
     * @param isConnected - Adjacency matrix of the graph
     * @param u - Current node to explore
     * @param visited - Array to track visited nodes
     */
    private void dfs(int[][] isConnected, int u, boolean[] visited) {
        visited[u] = true; // Mark the current node as visited

        // Visit all neighbors of the current node
        for (int v = 0; v < n; v++) {
            if (!visited[v] && isConnected[u][v] == 1) { // If not visited and there is a connection
                dfs(isConnected, v, visited); // Recur for the neighbor
            }
        }
    }

    /**
     * Find the number of connected components (provinces).
     * @param isConnected - Adjacency matrix of the graph
     * @return Number of connected components
     */
    public int findCircleNum(int[][] isConnected) {
        n = isConnected.length; // Initialize the number of nodes

        boolean[] visited = new boolean[n]; // Track visited nodes
        int count = 0; // Count of connected components

        // Iterate over each node
        for (int i = 0; i < n; i++) {
            if (!visited[i]) { // If the node has not been visited
                count++; // Increment the connected component count
                dfs(isConnected, i, visited); // Perform DFS from the current node
            }
        }

        return count; // Return the total number of connected components
    }

    public static void main(String[] args) {
        Number_Of_Provinces solution = new Number_Of_Provinces();

        // Example input: Adjacency matrix representing connections between nodes
        int[][] isConnected = {
                {1, 1, 0},
                {1, 1, 0},
                {0, 0, 1}
        };

        // Output the number of connected components (provinces)
        System.out.println("Number of Provinces: " + solution.findCircleNum(isConnected));
    }
}

