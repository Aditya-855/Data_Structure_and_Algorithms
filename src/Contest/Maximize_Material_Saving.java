package Contest;
import java.util.*;
public class Maximize_Material_Saving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Number of containers
        int n = scanner.nextInt();

        // Materials in each container
        int[] materials = new int[n];
        for (int i = 0; i < n; i++) {
            materials[i] = scanner.nextInt();
        }

        // Lids configuration
        String lids = scanner.next();

        // Maximize materials saved
        System.out.println(maximizeMaterials(materials, lids));

        scanner.close();
    }

    public static int maximizeMaterials(int[] materials, String lids) {
        int n = materials.length;
        boolean[] covered = new boolean[n];

        // Initialize covered array based on lids
        for (int i = 0; i < n; i++) {
            covered[i] = lids.charAt(i) == '1';
        }

        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        int totalSaved = 0;

        for (int i = 0; i < n; i++) {
            if (covered[i]) {
                maxHeap.add(materials[i]);
                if (i > 0 && maxHeap.size() > 1) {
                    maxHeap.add(materials[i - 1]);
                }
            }

            if (!maxHeap.isEmpty()) {
                totalSaved += maxHeap.poll();
            }
        }

        return totalSaved;
    }
}
/*Input
5
10
5
8
9
6
01110
*/
/*
Output
27
 */