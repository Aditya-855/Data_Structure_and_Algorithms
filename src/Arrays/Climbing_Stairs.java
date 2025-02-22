package Arrays;


public class Climbing_Stairs {
    public static void main(String[] args) {
        int n = 3;
        // Base cases: If there is 1 or 0 steps, there is only one way to climb
        int prev1 = 1; // Represents ways to reach (n-1)th step
        int prev2 = 1; // Represents ways to reach (n-2)th step

        // Loop from step 2 to n, since first two cases (n=0,1) are covered by initial values
        for (int i = 2; i <= n; i++) {
            int curr_i = prev2 + prev1; // The current step's ways = (ways to (n-1) + ways to (n-2))
            prev2 = prev1; // Update prev2 to be the old prev1 (moving one step ahead)
            prev1 = curr_i; // Update prev1 to be the new calculated value
            }
        System.out.println(prev1);// Return the final computed number of ways
    }
}

