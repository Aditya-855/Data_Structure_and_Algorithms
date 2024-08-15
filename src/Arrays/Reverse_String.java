package Arrays;
import java.io.*;
import java.util.Scanner;
public class Reverse_String {
        public static void main (String[] args) {

            String str= "ADITYA PANWAR", Rstr="";
            char ch;

            System.out.println("Before Reversing: "+ str);

            for (int i=0; i<str.length(); i++)
            {
                ch= str.charAt(i);
                Rstr= ch + Rstr;
            }
            System.out.println("After Reversing: " + Rstr);
        }

}
