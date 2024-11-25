package Leetcode;

public class Add_Digits {
    public static int addDigits(int num) {
        if(num==0){
            return 0;
        }
        return(num%9==0)?9:num%9;//if number is completely devisible by 9 then the remainder will be 0 Then return 9 other wise it should be remainder num%9
    }

    public static void main(String[] args) {
        int num=345;
        System.out.println(addDigits(num));
    }
}