package Dynamic_Programming;

import java.util.*;

public class Knapsack {
    // Returns the maximum value that
    // can be put in a knapsack of capacity W
    static int knapsackRec(int W, int[] val, int[] wt, int n) {
        // Base Case
        if (n == 0 || W == 0)
            return 0;

        int pick = 0;

        // Pick nth item if it does not exceed the capacity of knapsack
        if (wt[n - 1] <= W)
            pick = val[n - 1] + knapsackRec(W - wt[n - 1], val, wt, n - 1);

        // Don't pick the nth item
        int notPick = knapsackRec(W, val, wt, n - 1);

        return Math.max(pick, notPick);
    }

    static int knapsack(int W, int[] val, int[] wt) {
        int n = val.length;
        return knapsackRec(W, val, wt, n);
    }

    public static void main(String[] args) {
        int[] val = {1, 2, 3};
        int[] wt = {4, 5, 1};
        int W = 4;

        System.out.println(knapsack(W, val, wt));
    }
}
