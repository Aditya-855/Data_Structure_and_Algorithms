package Leetcode;

public class Index_Of_First_Occurence {
    public static void main(String[] args) {
        String haystack="sadbutsad";
        String needle="bad";
        System.out.println(strStr(haystack,needle));
    }
    public static int strStr(String haystack,String needle){
        return haystack.indexOf(needle);
    }
}
