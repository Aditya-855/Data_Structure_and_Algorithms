package Graphs;

import java.util.*;

public class BFS_Of_Graph{
    // Helper function to perform BFS
    private void BFS(List<List<Integer>> adj, int u, boolean[] visited, List<Integer> result) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(u);
        visited[u] = true;
        result.add(u);

        while (!queue.isEmpty()) {
            int current = queue.poll();
            for (int neighbor : adj.get(current)) {
                if (!visited[neighbor]) {
                    queue.add(neighbor);
                    visited[neighbor] = true;
                    result.add(neighbor);
                }
            }
        }
    }

    // Function to return Breadth First Traversal of the graph
    public List<Integer> bfsOfGraph(int V, List<List<Integer>> adj) {
        List<Integer> result = new ArrayList<>();
        boolean[] visited = new boolean[V];

        // Start BFS from vertex 0
        BFS(adj, 0, visited, result);

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
                adj.get(v).add(u); // For undirected graph, add both u->v and v->u
            }

            BFS_Of_Graph obj = new BFS_Of_Graph();
            List<Integer> ans = obj.bfsOfGraph(V, adj);

            // Print the BFS traversal
            for (int node : ans) {
                System.out.print(node + " ");
            }
            System.out.println();
        }

        sc.close();
    }
}

