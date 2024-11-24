package Leetcode;
import java.util.*;
public class Can_Place_Flower {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) { // Iterating through the array
            if (flowerbed[i] == 0) { // Checking the previous and next positions to ensure they are empty
                int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0) ? 0 : 1;
                if (prev == 0 && next == 0) { // If both positions are empty, plant a flower
                    flowerbed[i] = 1;
                    count++;
                }
            }
            if (count >= n) {
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        Can_Place_Flower solution = new Can_Place_Flower();

        // Test cases
        int[] flowerbed1 = {1, 0, 0, 0, 1};
        int n1 = 1;
        System.out.println("Test Case 1: " + solution.canPlaceFlowers(flowerbed1, n1)); // Expected: true

        int[] flowerbed2 = {1, 0, 0, 0, 1};
        int n2 = 2;
        System.out.println("Test Case 2: " + solution.canPlaceFlowers(flowerbed2, n2)); // Expected: false

        int[] flowerbed3 = {0, 0, 1, 0, 0};
        int n3 = 2;
        System.out.println("Test Case 3: " + solution.canPlaceFlowers(flowerbed3, n3)); // Expected: true

        int[] flowerbed4 = {0, 0, 0, 0, 0};
        int n4 = 3;
        System.out.println("Test Case 4: " + solution.canPlaceFlowers(flowerbed4, n4)); // Expected: true

        int[] flowerbed5 = {1, 1, 1, 1, 1};
        int n5 = 0;
        System.out.println("Test Case 5: " + solution.canPlaceFlowers(flowerbed5, n5)); // Expected: true
    }
}
