package Leetcode.Dynamic_Programming;
import java.util.*;
class Fibonacci{
    public static int f(int n, int[] dp){
        if(n<=1) return n;

        if(dp[n]!= -1) return dp[n];
        return dp[n]= f(n-1,dp) + f(n-2,dp);
    }
    public static void main(String args[]) {

        int n=5;
        int dp[]=new int[n+1];
        Arrays.fill(dp,-1);
        System.out.println(f(n,dp));
    }
}

//Another Method LeetCode
class Solution {
    public int fib(int n) {

        //Base Condition
        if(n==0)
            return 0;

        int dp[]=new int[n+1];

        //Assign starting elements -> 0,1
        dp[0]=0;dp[1]=1;

        //Run loop till n and store sum of last two elements in dp[i]
        for(int i=2;i<=n;i++)
            dp[i]=dp[i-1]+dp[i-2];

        //return the F(n) value
        return dp[n];
    }
}