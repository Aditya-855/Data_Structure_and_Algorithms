package Training_HitbullsEye;

public class Power_Question {
    public static int pow(int n,int p){
        if(p==0){
            return 1;
        }else {
            return n*pow(n,p-1);
        }
    }
    public static void main(String[] args){
        int n=5;
        int p=0;
        System.out.println(pow(n,p));
    }
}
