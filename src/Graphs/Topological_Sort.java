package Graphs;
import java.util.*;
public class Topological_Sort {
    // Helper function for DFS
    private void DFS(List<Integer>[] adj, int u, boolean[] visited, Stack<Integer> st) {
        visited[u] = true;

        // Process all neighbors of u
        for (int v : adj[u]) {
            if (!visited[v]) {
                DFS(adj, v, visited, st);
            }
        }
        // Push the current node to the stack
        st.push(u);
    }

    // Function to perform topological sort
    public List<Integer> topoSort(int V, List<Integer>[] adj) {
        boolean[] visited = new boolean[V];
        Stack<Integer> st = new Stack<>();

        // Perform DFS for all unvisited nodes
        for (int i = 0; i < V; i++) {
            if (!visited[i]) {
                DFS(adj, i, visited, st);
            }
        }

        // Extract elements from stack to form the result
        List<Integer> result = new ArrayList<>();
        while (!st.isEmpty()) {
            result.add(st.pop());
        }

        return result;
    }
    public static void main(String[] args) {
        // Number of vertices
        int V = 6;

        // Adjacency list representation of the graph
        List<Integer>[] adj = new ArrayList[V];
        for (int i = 0; i < V; i++) {
            adj[i] = new ArrayList<>();
        }

        // Add edges
        adj[5].add(2);
        adj[5].add(0);
        adj[4].add(0);
        adj[4].add(1);
        adj[2].add(3);
        adj[3].add(1);

        // Create an instance of Solution and call topoSort
        Topological_Sort solution = new Topological_Sort();
        List<Integer> topoOrder = solution.topoSort(V, adj);

        // Print the result
        System.out.println("Topological Sort:");
        for (int node : topoOrder) {
            System.out.print(node + " ");
        }
    }
}
