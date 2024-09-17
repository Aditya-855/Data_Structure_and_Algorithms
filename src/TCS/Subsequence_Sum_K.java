package TCS;

import java.util.Scanner;
import java.util.Arrays;

public class Subsequence_Sum_K {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of rooms:");
        int n=sc.nextInt();
        System.out.println("enter the target value:");
        int k=sc.nextInt();

        int[] coins=new int[n];
        System.out.println("enter the value of each rooms:");
        for (int i=0;i<n;i++){
            coins[i]=sc.nextInt();
        }
        int[] result=Ssk(n,k,coins);
        System.out.println("Enter From room no: "+(result[0]+1)+" And  exit rooms no:"+(result[1]+1));
        //System.out.println(Arrays.toString(new String[] {"Enter From room no: " + (result[0] + 1), "And exit rooms no: " + (result[1] + 1)}));
        //System.out.println(Arrays.toString(new int[] {result[0] + 1, result[1] + 1}));
    }
    public static int[] Ssk(int n,int k,int[] coins){
        int start=0,end=0,current_sum=0;
        int[] result={0,Integer.MAX_VALUE};

        while(end<n){
            current_sum+=coins[end];

            while (current_sum>k){
                current_sum-=coins[start];
                start++;
            }
            if (current_sum==k && (end-start<result[1]-result[0])){
                result[0]=start;
                result[1]=end;
            }
            end++;
        }
            if (result[1]==Integer.MAX_VALUE){
                System.out.println("No Solution found");
            }
            return result;
    }
}
