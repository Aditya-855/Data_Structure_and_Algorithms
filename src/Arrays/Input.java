package Arrays;

import java.util.Scanner;
import java.util.Arrays;
public class Input {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        //array of primitives
        int[] arr=new int[5];
        arr[0]=23;
        arr[1]=34;
        arr[2]=14;
        arr[3]=54;
        arr[4]=64;
        //[23,34,14,54,64]
        //System.out.println(arr[3]);

        //input using for loop
//        for (int i=0;i<arr.length;i++){
//            arr[i] = sc.nextInt();
//        }
//        System.out.println(Arrays.toString(arr));
//        for (int i=0;i<arr.length;i++) {
//            System.out.print(arr[i] + " ");
//        }
//            for (int num:arr){ //for every element in array,print the element
//                System.out.print(num+" "); //here num represents element of the array
//           }

        //array of objects
        String[] str=new String[4];
        for (int i=0;i< str.length;i++){
            str[i]=sc.next();
        }
        System.out.println(Arrays.toString(str));

        //modify
        str[1]="aditya";
        System.out.println(Arrays.toString(str));
    }
}
