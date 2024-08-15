package Arrays;

import java.util.Scanner;

public class Creating_methods {
    public static void main(String[] args) {
        sum();
    }
     /*
      access modifier
      return_type name(){
      //body
      return statement;
      }
     */
    static void sum(){
        //Q: take input of 2 numbers and print the sum
        Scanner sc=new Scanner(System.in);
         System.out.println("enter no 1: ");
         int num1= sc.nextInt();
         System.out.println("enter no 2: ");
         int num2= sc.nextInt();
         int sum=num1+num2;
        System.out.println("Sum is:"+sum);
    }
}
