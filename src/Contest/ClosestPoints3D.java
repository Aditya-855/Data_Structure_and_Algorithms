package Contest;
import java.util.*;

public class ClosestPoints3D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: Reference point coordinates
        int x0 = scanner.nextInt();
        int y0 = scanner.nextInt();
        int z0 = scanner.nextInt();

        // Input: Number of points
        int N = scanner.nextInt();

        // Skip the number of columns (fixed as 3)
        scanner.nextInt();

        // Input: List of points
        int[][] points = new int[N][3];
        for (int i = 0; i < N; i++) {
            points[i][0] = scanner.nextInt();
            points[i][1] = scanner.nextInt();
            points[i][2] = scanner.nextInt();
        }

        // Input: Number of closest points to find
        int k = scanner.nextInt();

        // Calculate the k closest points
        List<int[]> closestPoints = findKClosestPoints(x0, y0, z0, points, k);

        // Output the result
        for (int[] point : closestPoints) {
            System.out.println(point[0] + " " + point[1] + " " + point[2]);
        }

        scanner.close();
    }

    private static List<int[]> findKClosestPoints(int x0, int y0, int z0, int[][] points, int k) {
        PriorityQueue<int[]> maxHeap = new PriorityQueue<>((p1, p2) -> {
            long dist1 = calculateSquaredDistance(p1, x0, y0, z0);
            long dist2 = calculateSquaredDistance(p2, x0, y0, z0);

            if (dist1 == dist2) {
                // Lexicographical comparison when distances are equal
                if (p1[0] != p2[0]) return Integer.compare(p2[0], p1[0]);
                if (p1[1] != p2[1]) return Integer.compare(p2[1], p1[1]);
                return Integer.compare(p2[2], p1[2]);
            }

            return Long.compare(dist2, dist1); // Descending order for maxHeap
        });

        for (int[] point : points) {
            maxHeap.offer(point);
            if (maxHeap.size() > k) {
                maxHeap.poll();
            }
        }

        List<int[]> result = new ArrayList<>(maxHeap);

        // Sort by distance first, then lexicographically
        result.sort((p1, p2) -> {
            long dist1 = calculateSquaredDistance(p1, x0, y0, z0);
            long dist2 = calculateSquaredDistance(p2, x0, y0, z0);

            if (dist1 != dist2) return Long.compare(dist1, dist2); // Ascending by distance

            // Lexicographical order
            if (p1[0] != p2[0]) return Integer.compare(p1[0], p2[0]);
            if (p1[1] != p2[1]) return Integer.compare(p1[1], p2[1]);
            return Integer.compare(p1[2], p2[2]);
        });

        return result;
    }

    private static long calculateSquaredDistance(int[] point, int x0, int y0, int z0) {
        long dx = point[0] - x0;
        long dy = point[1] - y0;
        long dz = point[2] - z0;
        return dx * dx + dy * dy + dz * dz;
    }
}
/*Input Format
0
0
0
5
3
1 2 3
4 5 6
7 8 9
1 0 0
0 1 1
3
 */
/*
Output
1 0 0
0 1 1
1 2 3
 */