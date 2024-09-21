package Hashing;

import java.util.*;

class Number_Occurence {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Array");

        int n;
        n = sc.nextInt();
        System.out.println("Enter the Numbers of Array");
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        //precompute:
        int[] hash = new int[13];
        for (int i = 0; i < n; i++) {
            hash[arr[i]] += 1;
        }

        System.out.println("Enter the Numbers to Get Occurrence:");
        int q;
        q = sc.nextInt();
        while (q-- != 0) {
            int number;
            System.out.println("Enter The Number");
            number = sc.nextInt();
            // fetching:
            System.out.println(number+" --> This number Occurred "+hash[number]+" times");
            //System.out.println();
        }
    }
}