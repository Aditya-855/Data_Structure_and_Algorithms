package Leetcode;

public class Find_The_Difference {
    public static void main(String[] args) {
        String s="abcd";
        String t="abcde";
        System.out.println(findDifference(s,t));
    }

    public static char findDifference(String s,String t){
        int total=0;
        for (int i=0;i<t.length();i++){
            total =total+t.charAt(i);
        }
        for (int i=0;i<s.length();i++){
            total=total-s.charAt(i);
        }
        return (char)total;
    }
}
