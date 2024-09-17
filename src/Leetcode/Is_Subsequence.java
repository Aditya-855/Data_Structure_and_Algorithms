package Leetcode;

class Is_Subsequence {
    public static void main(String[] args) {
        String s="abc";
        String t="ahbfgc";
        System.out.println(isSubsequence(s,t));
    }
    public static  boolean isSubsequence(String s, String t) {
        if(s.length()==0){
            return true;
        }
        int i=0;
        int j=0;
        while(i<s.length() && j<t.length()){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }
        }
        if(i==s.length()){
            return true;
        }
        return false;
    }
}
