package Arrays;

import java.util.Scanner;

public class Array_Sum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Size of Array");
        int n=sc.nextInt();
        int[] arr=new int[n];
        System.out.println("Enter Elements of Array");
        for (int i=0;i<=n-1;i++){
            arr[i]=sc.nextInt();
        }
        for (int i=0;i<=n-1;i++){
            sum=sum+arr[i];
        }
        System.out.println("Sum of The Elements is:"+sum);
    }
}
