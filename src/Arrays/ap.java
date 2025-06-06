package Arrays;

import java.util.Scanner;

public class ap {
    public static void main(String[] args) {
        //System.out.println(" 1 ro 10 ");
        System.out.println("Please enter a Number");
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
       while(num!=0){
           int digit=num%10;
           if(digit%2==0){
               System.out.println(digit);
           }
           num=num/10;
           System.out.println(digit);
       }
    }
}
