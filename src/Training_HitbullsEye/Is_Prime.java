package Training_HitbullsEye;

public class Is_Prime {
    public static boolean isprime(int n) {
        if (n <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n2 = 10;
        int count=0;
        for (int i = 1; i < n2; i++) {
            if (isprime(i)) {
                count++;
                System.out.println(i + " Number is Prime");
            } else {
                System.out.println(i + " Number is Not Prime");
            }
        }
         System.out.println("Total Prime Number is:"+count);
    }
}
