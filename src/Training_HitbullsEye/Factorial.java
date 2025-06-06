//package Training_HitbullsEye;
//
//public class Factorial {
//    public static int fact(int n){
//        if(n==1||n==0){
//            return 1;
//        }else {
//            return n * fact(n - 1);
//        }
//    }
//    public static int strong(int n){
//        //int ori=n;
//        int result=0;
//        while (n!=0){
//            n=n%10;
//            result=result+fact(n);
//            n=n/10;
//        }
//        return result;
//    }
//    public static void main(String[] args) {
//        int n=143;
//        //fact(n);
//        //System.out.println("Factorial of Number is:"+fact(n));
//        strong(n);
//        System.out.println(strong(n));
//    }
//}
package Training_HitbullsEye;

public class Factorial {

    // Method to calculate factorial
    public static int fact(int n){
        if(n == 0 || n == 1){
            return 1;
        }
        return n * fact(n - 1);
    }

    // Method to calculate sum of factorials of digits
    public static int sumOfDigitFactorials(int n){
        int original = n;
        int result = 0;
        while (n != 0){
            int digit = n % 10;
            result += fact(digit);
            n = n / 10;
        }
        return result;
    }

    public static void main(String[] args) {
        int n = 145; // Example of a Strong number
        int sum = sumOfDigitFactorials(n);
        System.out.println("Sum of factorials of digits of " + n + " is: " + sum);

        if(sum == n){
            System.out.println(n + " is a Strong number.");
        } else {
            System.out.println(n + " is not a Strong number.");
        }
    }
}
