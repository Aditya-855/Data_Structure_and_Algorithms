package Leetcode;

import java.util.ArrayList;
import java.util.List;

public class Palindrome_Partitioning {
    public static void main(String[] args) {
        String s= "aab";
        System.out.println(partition(s));
    }
        public static List<List<String>> partition(String s) {
            List<List<String>> result=new ArrayList<>();
            List<String> Path=new ArrayList<>();
            func(0,s,Path,result);
            return result;
        }
       public static void func(int index,String s,List<String> Path,List<List<String>> result){
            if(index==s.length()){
                result.add(new ArrayList<>(Path));
                return;
            }
            for(int i=index;i<s.length();i++){
                if(isPalindrome(s,index,i)){
                    Path.add(s.substring(index, i+1));
                    func(i+1,s,Path,result);
                    Path.remove(Path.size()-1);
                }
            }
        }
        public static boolean isPalindrome(String s,int start,int end){
            while(start<=end){
                if(s.charAt(start++)!=s.charAt(end--))
                    return false;
            }
            return true;
        }
    }
