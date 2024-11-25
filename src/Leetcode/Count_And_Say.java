package Leetcode;

public class Count_And_Say {
    public static void main(String[] args) {
        Count_And_Say solution = new Count_And_Say();
        int n = 5; // Example input
        String result = solution.countAndSay(n);
        System.out.println("The " + n + "th term in the Count and Say sequence is: " + result);
    }
    public String countAndSay(int n) {
        String s = "1"; // As defined in the question, the first term
        for (int i = 2; i <= n; i++) { // Start from the second term
            s = countAndAdd(s); // Update the sequence term by term
        }
        return s; // Return the final term
    }

    String countAndAdd(String s) {
        StringBuilder curString = new StringBuilder(); // Create a StringBuilder object
        char c = s.charAt(0); // Take the first character of the string
        int count = 1; // Initialize count to 1 for the first character

        for (int i = 1; i < s.length(); i++) { // Iterate through the string
            if (s.charAt(i) == c) { // Check if the current character matches
                count++; // Increment the count
            } else {
                curString.append(count); // Append the count
                curString.append(c); // Append the character
                c = s.charAt(i); // Update the character
                count = 1; // Reset count for the new character
            }
        }

        curString.append(count); // Append the count for the last character
        curString.append(c); // Append the last character
        return curString.toString(); // Convert to string and return
    }
}

//class Solution {
//    public String countAndSay(int n) {
//        //n=1
//        //"1"
//        //n=2
//        //"11" 1 time 1
//        //n=3
//        //"21" 2 time 1
//        //n=4
//        //"1211" 1 time 2 and 1 time 1
//        //n=5
//        //"111221" 1 time 1,1 time 2 , 2 time 1
//        String s="1"; //as defined in the question first term
//        for(int i=2;i<=n;i++){ //i=2 bcz first term is initialized by 1
//            s=countAndAdd(s); //will pass function in the String
//        }
//        return s; //to return the solution s
//    }
//    String countAndAdd(String s){ //main function
//        StringBuilder curString=new StringBuilder(); //object is created of stringbuilder class name is curstring
//        char c=s.charAt(0); //Value of String is taken into char and first character of string is putted in the char c
//        int count=1; //bcz the character of C is counted as 1
//        for(int i=1;i<s.length();i++){ //to iterate the string
//            if(s.charAt(i)==c){//checking that the current character is equal to c
//                count++; //if true then count increases
//            }else{
//                curString.append(count); //if false then we will add the character count
//                curString.append(c); //the  we will add our character to the string
//                c=s.charAt(i); //we will change the value of c
//                count=1; //then we will reset our count value to 1 bcz
//            }
//        }
//        curString.append(count);//to add our count value when previous char is not equal to next
//        curString.append(c);//to add our character value when previous char is not equal to next
//        return curString.toString();//to convert the object curstring to the string to return the result
//    }
//}