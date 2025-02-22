package Leetcode;

import java.util.HashSet;

public class Happy_Number {
    public boolean isHappy(int n) {
        HashSet<Integer> seen = new HashSet<>(); // To track visited numbers

        while (n != 1 && !seen.contains(n)) {
            seen.add(n); // Store the current number
            int sum = 0;

            // Compute sum of squares of digits
            while (n > 0) {
                int digit = n % 10;
                sum += digit * digit;
                n /= 10;
            }
            n = sum; // Update n to the sum of squares
        }

        return n == 1; // If we reach 1, it's happy; otherwise, a cycle exists
    }

    public static void main(String[] args) {
        Happy_Number solution = new Happy_Number();

        System.out.println("19 is Happy? " + solution.isHappy(19)); // true
        System.out.println("2 is Happy? " + solution.isHappy(2));   // false
        System.out.println("7 is Happy? " + solution.isHappy(7));   // true
        System.out.println("4 is Happy? " + solution.isHappy(4));   // false
    }
}
