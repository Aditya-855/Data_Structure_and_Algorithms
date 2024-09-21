package Leetcode;

public class Length_Of_LastWord {
    public static void main(String[] args) {
        String s="Hello World";
        System.out.println(Len(s));
    }
    public static int Len(String s){
        int length=0;
        for(int i=s.length()-1;i>0;i--){
            if (s.charAt(i)!=' '){
                length++;
            }else{
                if (length>0){
                    return length;
                }
            }
        }
        return length;
    }
}
