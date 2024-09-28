package Patterns;

import java.util.Scanner;

public class Numbers {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N Value");
        int n= sc.nextInt();
        for (int i=0;i<=n;i++){
            for (int j=0;j<=n;j++){
                System.out.print((i+j) + " ");
            }
            System.out.println();
        }
    }
}
