package Graphs;

import java.util.ArrayList;
import java.util.List;

public class Detect_Cycle_Directed_Graph {

    // Method to check for a cycle using Depth-First Search (DFS)
    public boolean isCycleDFS(List<Integer>[] adj, int u, boolean[] visited, boolean[] inRecursion) {
        // Mark the current node as visited and part of the recursion stack
        visited[u] = true;
        inRecursion[u] = true;

        // Traverse all neighbors of the current node
        for (int v : adj[u]) {
            // If a neighbor is not visited, recursively check for a cycle
            if (!visited[v] && isCycleDFS(adj, v, visited, inRecursion)) {
                return true; // Cycle detected
            }
            // If the neighbor is in the recursion stack, it means there is a back edge (cycle)
            else if (inRecursion[v]) {
                return true; // Cycle detected
            }
        }

        // Remove the current node from the recursion stack as we backtrack
        inRecursion[u] = false;
        return false; // No cycle detected from this path
    }

    // Method to check if the directed graph contains a cycle
    public boolean isCyclic(int V, List<Integer>[] adj) {
        // Arrays to keep track of visited nodes and nodes in the recursion stack
        boolean[] visited = new boolean[V];
        boolean[] inRecursion = new boolean[V];

        // Iterate through all vertices of the graph
        for (int i = 0; i < V; i++) {
            // If a vertex is not visited, start a DFS from that vertex
            if (!visited[i] && isCycleDFS(adj, i, visited, inRecursion)) {
                return true; // Cycle detected
            }
        }
        return false; // No cycle found in the graph
    }

    public static void main(String[] args) {
        int V = 4; // Number of vertices in the graph

        // Create an adjacency list to represent the graph
        List<Integer>[] adj = new ArrayList[V];

        // Initialize the adjacency list
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        // Add directed edges to the graph
        adj[0].add(1); // Edge from vertex 0 to vertex 1
        adj[1].add(2); // Edge from vertex 1 to vertex 2
        adj[2].add(0); // Edge from vertex 2 to vertex 0 (creates a cycle)
        adj[2].add(3); // Edge from vertex 2 to vertex 3
        adj[3].add(3); // Edge from vertex 3 to itself (self-loop, creates a cycle)

        // Create an instance of the solution class
        Detect_Cycle_Directed_Graph solution = new Detect_Cycle_Directed_Graph();

        // Check if the graph contains a cycle
        if (solution.isCyclic(V, adj)) {
            System.out.println("Graph contains a cycle");
        } else {
            System.out.println("Graph does not contain a cycle");
        }
    }
}
