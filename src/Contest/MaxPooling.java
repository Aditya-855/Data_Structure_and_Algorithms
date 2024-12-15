package Contest;
import java.util.*;

public class MaxPooling {
    public static List<List<Integer>> max_pooling(List<List<Integer>> matrix, int k) {
        int n = matrix.size();
        int m = matrix.get(0).size();

        // Calculate dimensions of the max pool matrix
        int outputRows = n - k + 1;
        int outputCols = m - k + 1;
        List<List<Integer>> maxPoolMatrix = new ArrayList<>();

        // Perform max pooling
        for (int i = 0; i < outputRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < outputCols; j++) {
                row.add(findMaxInWindow(matrix, i, j, k));
            }
            maxPoolMatrix.add(row);
        }

        return maxPoolMatrix;
    }

    // Helper method to find the maximum value in a k x k window
    private static int findMaxInWindow(List<List<Integer>> matrix, int startRow, int startCol, int k) {
        int maxVal = Integer.MIN_VALUE;
        for (int i = startRow; i < startRow + k; i++) {
            for (int j = startCol; j < startCol + k; j++) {
                maxVal = Math.max(maxVal, matrix.get(i).get(j));
            }
        }
        return maxVal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the dimensions of the matrix
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        // Input the matrix
        List<List<Integer>> matrix = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            List<Integer> row = new ArrayList<>();
            for (int j = 0; j < m; j++) {
                row.add(scanner.nextInt());
            }
            matrix.add(row);
        }

        // Input the pooling window size
        int k = scanner.nextInt();

        // Perform max pooling
        List<List<Integer>> result = max_pooling(matrix, k);

        // Output the max pool matrix
        for (List<Integer> row : result) {
            for (int val : row) {
                System.out.print(val + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
/*Input
3
3
1 2 1
6 5 1
8 1 3
2
 */

/*Output
6 5
8 5
 */