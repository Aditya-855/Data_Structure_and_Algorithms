package Contest;

import java.util.*;

public class EulerianTour {

    public static String findEulerianTour(int n, int m, List<int[]> edges) {
        // Graph adjacency list
        Map<Integer, List<Integer>> graph = new TreeMap<>(); // TreeMap for lexicographical order
        Map<String, Integer> edgeCount = new HashMap<>();

        // Build graph and edge count map
        for (int[] edge : edges) {
            int u = edge[0];
            int v = edge[1];

            graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
            graph.computeIfAbsent(v, k -> new ArrayList<>()).add(u);

            String edgeKey = getEdgeKey(u, v);
            edgeCount.put(edgeKey, edgeCount.getOrDefault(edgeKey, 0) + 1);
        }

        // Check if an Eulerian circuit is possible
        for (int node : graph.keySet()) {
            if (graph.get(node).size() % 2 != 0) {
                return "None"; // Not all vertices have even degree
            }
        }

        // Perform Hierholzer's algorithm for Eulerian Circuit
        Stack<Integer> stack = new Stack<>();
        List<Integer> eulerianPath = new ArrayList<>();

        stack.push(edges.get(0)[0]); // Start from the first edge's first vertex

        while (!stack.isEmpty()) {
            int current = stack.peek();

            if (graph.get(current).isEmpty()) {
                eulerianPath.add(stack.pop());
            } else {
                int next = graph.get(current).remove(0);
                graph.get(next).remove((Integer) current);

                String edgeKey = getEdgeKey(current, next);
                edgeCount.put(edgeKey, edgeCount.get(edgeKey) - 1);

                if (edgeCount.get(edgeKey) == 0) {
                    edgeCount.remove(edgeKey);
                }

                stack.push(next);
            }
        }

        // If there are unused edges, the graph isn't Eulerian
        if (!edgeCount.isEmpty()) {
            return "None";
        }

        // Build the result path as a string
        StringBuilder result = new StringBuilder();
        for (int node : eulerianPath) {
            result.append(node).append(" ");
        }

        return result.toString().trim();
    }

    private static String getEdgeKey(int u, int v) {
        return Math.min(u, v) + "," + Math.max(u, v);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of vertices and edges
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        scanner.nextInt(); // Consume the fixed integer 2

        List<int[]> edges = new ArrayList<>();

        // Input the edges
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            edges.add(new int[]{u, v});
        }

        // Find and print the Eulerian tour
        System.out.println(findEulerianTour(n, m, edges));

        scanner.close();
    }
}
/*
Input
4 4
2 1
2 3
3 4
4 2
 */

/*
Output
2 1 3 4 2
 */
