package Arrays;


public class Climbing_Stairs {
    public static void main(String[] args) {
        int n = 3;

        int prev2 = 1;
        int prev = 1;

        for (int i = 2; i <= n; i++) {
            int cur_i = prev2 + prev;
            prev2 = prev;
            prev = cur_i;
        }
        System.out.println(prev);
    }
}

