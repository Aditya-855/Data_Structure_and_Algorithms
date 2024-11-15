package Graphs;

public class Bipartite_Graph {

    // 0 -> not colored
    // 1 -> blue
    // -1 -> red
    public boolean isBipartite(int[][] graph) {
        int[] color = new int[graph.length]; // Store color for nodes
        for (int i = 0; i < graph.length; i++) { // Iterate over all nodes
            if (color[i] == 0 && !validColor(graph, color, 1, i)) {
                return false; // If node is not yet colored and color is not valid, return false
            }
        }
        return true; // If all nodes are validly colored, return true
    }

    public boolean validColor(int[][] graph, int[] color, int c, int node) {
        if (color[node] != 0) { // If the node is already colored
            return color[node] == c; // Check if the color matches
        }

        color[node] = c; // Color the node
        for (int neighbor : graph[node]) { // Check all neighbors
            if (!validColor(graph, color, -c, neighbor)) {
                return false; // If any neighbor cannot be validly colored, return false
            }
        }
        return true; // If all neighbors are validly colored, return true
    }

    public static void main(String[] args) {
        Bipartite_Graph solution = new Bipartite_Graph();

        // Example graph (adjacency list)
        int[][] graph = {
                {1, 3},
                {0, 2},
                {1, 3},
                {0, 2}
        };

        System.out.println("Is the graph bipartite? " + solution.isBipartite(graph));

        // Test with a non-bipartite graph
        int[][] nonBipartiteGraph = {
                {1, 2, 3},
                {0, 2},
                {0, 1, 3},
                {0, 2}
        };

        System.out.println("Is the graph bipartite? " + solution.isBipartite(nonBipartiteGraph));
    }
}
