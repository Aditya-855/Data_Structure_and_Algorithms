package TCS;

import java.util.Scanner;

public class Demo{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read number of points
        int N = sc.nextInt();

        // Create an array to store the coordinates
        double[][] points = new double[N][3];

        // Read the coordinates in groups of three
        for (int i = 0; i < N; i++) {
            points[i][0] = sc.nextDouble(); // x coordinate
            points[i][1] = sc.nextDouble(); // y coordinate
            points[i][2] = sc.nextDouble(); // z coordinate
        }

        // Calculate the total distance travelled
        double totalDistance = 0;
        for (int i = 1; i < N; i++) {
            totalDistance += distance(points[i-1], points[i]);
        }

        // Output the total distance, formatted to two decimal places
        System.out.printf("%.2f%n", totalDistance);

        sc.close();
    }

    // Method to calculate the Euclidean distance between two points
    private static double distance(double[] point1, double[] point2) {
        return Math.sqrt(Math.pow(point1[0] - point2[0], 2) +
                Math.pow(point1[1] - point2[1], 2) +
                Math.pow(point1[2] - point2[2], 2));
    }
}

