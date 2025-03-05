package Leetcode;

public class Count_Total_Number_of_Colored_Cell {
    // Function to calculate the number of colored cells
    public long coloredCells(int n) {
        long count = 1; // Initially, only the center cell is colored

        // Loop from 1 to n to add layers to the pattern
        for (int i = 1; i <= n; i++) {
            count = count + (i - 1) * 4; // Adding 4*(i-1) cells for each step
        }

        return count; // Return the total number of colored cells
    }

    // Main method to test the function
    public static void main(String[] args) {
        Count_Total_Number_of_Colored_Cell solution = new Count_Total_Number_of_Colored_Cell(); // Creating an object of the Solution class

        int n = 3; // Example input
        long result = solution.coloredCells(n); // Calling the function

        System.out.println("Total number of colored cells for n = " + n + " is: " + result);
    }
}
