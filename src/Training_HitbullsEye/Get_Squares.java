package Training_HitbullsEye;

public class Get_Squares {
    public static int[] getSquares(int n){
        int[] result=new int[n+1];
        for (int i=0;i<=n;i++){
            result[i]=(i)*(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] squares=getSquares(5);
        System.out.println("Sqaures from 1 to 5: ");
        for (int val:squares){
            System.out.println(val);
        }
    }
}
