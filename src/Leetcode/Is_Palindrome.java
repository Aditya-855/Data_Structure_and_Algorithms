package Leetcode;

public class Is_Palindrome {
    public static void main(String[] args) {
            int x = -121;
        System.out.println(isPalindrome(x));
    }
    public static boolean isPalindrome(int x){
        int temp=x;
        //int digit=0;
        int rev=0;
        while(x>0){
            int digit=x%10;
            rev=rev*10+digit;
            x=x/10;
        }
        if(rev==temp){
            return true;
        }
        return false;
    }
}
