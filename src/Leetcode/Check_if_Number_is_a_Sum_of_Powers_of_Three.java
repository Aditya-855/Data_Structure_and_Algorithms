package Leetcode;

public class Check_if_Number_is_a_Sum_of_Powers_of_Three {
    /**
     * Checks if the given number can be represented as a sum of distinct powers of three.
     * @param n The number to check.
     * @return True if the number can be represented as a sum of distinct powers of three, else false.
     */
    public boolean checkPowersOfThree(int n) {
        while (n > 0) {
            // If remainder when divided by 3 is 2, it cannot be expressed as a sum of distinct powers of 3
            if (n % 3 == 2) {
                return false;
            }
            // Reduce n by dividing it by 3
            n = n / 3;
        }
        return true; // If all digits in base 3 are 0 or 1, return true
    }

    public static void main(String[] args) {
        Check_if_Number_is_a_Sum_of_Powers_of_Three solution = new Check_if_Number_is_a_Sum_of_Powers_of_Three();

        // Test cases
        int test1 = 12; // 12 in base 3 is "110" -> valid
        int test2 = 91; // 91 in base 3 is "10101" -> valid
        int test3 = 21; // 21 in base 3 is "210" -> invalid (contains '2')

        System.out.println("Check for 12: " + solution.checkPowersOfThree(test1)); // true
        System.out.println("Check for 91: " + solution.checkPowersOfThree(test2)); // true
        System.out.println("Check for 21: " + solution.checkPowersOfThree(test3)); // false
    }
}
