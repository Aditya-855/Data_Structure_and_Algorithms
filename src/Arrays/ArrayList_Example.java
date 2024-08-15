package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_Example {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //syntax
        ArrayList<Integer> list=new ArrayList<>(10);

//        list.add(67);
//        list.add(234);
//        list.add(654);
//        list.add(43);
//        list.add(654);
//        list.set(0,99);
//
//        list.remove(2);
//
//
//        System.out.println(list.contains(65456));
//        System.out.println(list);

        //input
        for (int i=0;i<5;i++){
           list.add(sc.nextInt());
        }

        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));//pass index here , list[index] syntax will not work here
        }
       // System.out.println(list);
    }
}
