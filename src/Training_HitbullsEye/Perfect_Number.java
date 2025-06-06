package Training_HitbullsEye;

public class Perfect_Number {
    public static void main(String[] args) {
        int n=6;
        int sum=0;
        for (int i=1;i<6;i++){
            if(n%i==0){
                sum=sum+i;
            }
        }
        System.out.println("Sum of The Factorial is:"+sum);
        if (sum==n){
            System.out.println("This is a Perfect Number");
        }else {
            System.out.println("This is Not a Perfect Number");
        }
    }
}
