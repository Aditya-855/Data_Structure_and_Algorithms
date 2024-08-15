package Leetcode;

public class Reverse_String {
    public static void main(String[] args) {
        String s="Hello World ";
        System.out.println(reverseWords(s.toCharArray()));
    }
    static void reverse(char s[],int start,int end){
        char temp;
        while(start<=end){
            temp=s[start];
            s[start]=s[end];
            s[end]=temp;
            start++;
            end--;
        }
    }
    static char[] reverseWords(char[] s){
        int start=0;
        for (int end=0;end<s.length;end++){
            if (s[end]==' '){
                reverse(s, start, end);
                start=end+1;
            }
        }
        reverse(s,start,s.length-1);

        reverse(s,0,s.length-1);
        return s;
    }
}
