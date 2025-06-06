package Arrays;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class Check {
    public static void main(String[] args) {
        System.out.println("Please Enter a Number");
        Scanner sc=new Scanner(System.in);

        long a=sc.nextLong();
        int count=0;
        if(a==0){
            System.out.println("Number of Digits is:1");
        }else {
        while(a>0){
            a=a/10;
            count++;
        }
        System.out.println("Number of Digits is:"+count);
         }
    }
}
