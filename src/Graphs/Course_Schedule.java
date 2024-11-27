package Graphs;
import java.util.*;
public class Course_Schedule {
    private boolean topologicalSortCheck(Map<Integer, List<Integer>> adj, int n, int[] indegree) {
        Queue<Integer> queue = new LinkedList<>();
        int count = 0;

        // Add all nodes with indegree 0 to the queue
        for (int i = 0; i < n; i++) {
            if (indegree[i] == 0) {
                count++;
                queue.add(i);
            }
        }

        // Process the graph using Kahn's algorithm
        while (!queue.isEmpty()) {
            int u = queue.poll();

            for (int v : adj.getOrDefault(u, new ArrayList<>())) {
                indegree[v]--;
                if (indegree[v] == 0) {
                    count++;
                    queue.add(v);
                }
            }
        }

        // If all nodes were visited, there's no cycle
        return count == n;
    }

    public boolean canFinish(int numCourses, int[][] prerequisites) {
        Map<Integer, List<Integer>> adj = new HashMap<>();
        int[] indegree = new int[numCourses];

        // Build the graph and indegree array
        for (int[] pair : prerequisites) {
            int a = pair[0];
            int b = pair[1];

            adj.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
            indegree[a]++;
        }

        // Check if we can finish all courses
        return topologicalSortCheck(adj, numCourses, indegree);
    }

    // Example usage
    public static void main(String[] args) {
        Course_Schedule  sol = new Course_Schedule ();
        int numCourses = 4;
        int[][] prerequisites = { {1, 0}, {2, 1}, {3, 2} };

        System.out.println(sol.canFinish(numCourses, prerequisites)); // Output: true
    }
}

