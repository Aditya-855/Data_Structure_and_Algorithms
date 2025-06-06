package Training_HitbullsEye;

public class Prime_Factors {
    public static boolean isprime(int n){
        for (int i=2;i<n/2;i++){
            if (n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        int n=14;
        for (int i=2;i<=n;i++){
            if(n%i==0 && isprime(i)){
                System.out.println("Prime Factors of number is: "+i);
            }
        }
    }
}