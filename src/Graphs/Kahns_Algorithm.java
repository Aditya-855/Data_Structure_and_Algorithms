package Graphs;
import java.util.*;
public class Kahns_Algorithm {
    // Function to perform topological sort using Kahn's Algorithm
    public List<Integer> topoSort(int V, List<Integer>[] adj) {
        Queue<Integer> queue = new LinkedList<>();
        int[] indegree = new int[V];

        // Step 1: Calculate in-degrees of all vertices
        for (int u = 0; u < V; u++) {
            for (int v : adj[u]) {
                indegree[v]++;
            }
        }

        // Step 2: Add all vertices with in-degree 0 to the queue
        for (int i = 0; i < V; i++) {
            if (indegree[i] == 0) {
                queue.add(i);
            }
        }

        // Step 3: Perform BFS
        List<Integer> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int u = queue.poll();
            result.add(u);

            for (int v : adj[u]) {
                indegree[v]--;

                if (indegree[v] == 0) {
                    queue.add(v);
                }
            }
        }

        // Check for cycles (if result size is not equal to V, a cycle exists)
        if (result.size() != V) {
            throw new IllegalArgumentException("The graph contains a cycle, so topological sorting is not possible.");
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
        Kahns_Algorithm solution = new Kahns_Algorithm();
        try {
            List<Integer> topoOrder = solution.topoSort(V, adj);

            // Print the result
            System.out.println("Topological Sort:");
            for (int node : topoOrder) {
                System.out.print(node + " ");
            }
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}

