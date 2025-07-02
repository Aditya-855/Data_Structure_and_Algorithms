package Graphs;
import java.util.*;

public class DFS_Of_Graph {
    // Helper function to perform DFS
    private void DFS(List<List<Integer>> adj, int u, boolean[] visited, List<Integer> result) {
        visited[u] = true;
        result.add(u);
        for (int v : adj.get(u)) {
            if (!visited[v]) {
                DFS(adj, v, visited, result);
            }
        }
    }

    // Function to return a list containing the DFS traversal of the graph
    public List<Integer> dfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];
        DFS(adj, 0, visited, result); // Start DFS from vertex 0
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt(); // Number of test cases
        while (tc-- > 0) {
            int V = sc.nextInt(); // Number of vertices
            int E = sc.nextInt(); // Number of edges

            List<List<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) {
                adj.add(new ArrayList<>());
            }

            // Building the adjacency list
            for (int i = 0; i < E; i++) {
                int u = sc.nextInt();
                int v = sc.nextInt();
                adj.get(u).add(v);
                adj.get(v).add(u); // For undirected graph, remove for directed graph
            }

            // Create DFS Object and run DFS
            DFS_Of_Graph obj = new DFS_Of_Graph();
            List<Integer> ans = obj.dfsOfGraph(V, adj);

            // Printing the result
            for (int node : ans) {
                System.out.print(node + " ");
            }
            System.out.println();
        }
        sc.close();
    }
}
