package Arrays;

public class Arrays {
    public static void main(String[] args) {
        //Q: store a roll number
        int a=18;

        //Q: store a person's name
        String name="Aditya Panwar";

        //Q: store 5 roll number
        int r1=23;
        int r2=44;
        int r3=34;

        //syntax
        //datatype[] variable_name=new datatype[size];
        //store 5 roll numbers:
//        int [] roll_numbers=new int[5];
        //or directly
//        int [] roll_numbers2={1,2,3,4,5};

        int[] ros; //declaration of array.ros is getting defined in the stack
        ros=new int[4]; // initialization: actually here object is being created in the memory (heap)

        System.out.println(ros[1]);

        //null is a literal

        String[] arr=new String[4];
        System.out.println(arr[0]);

    }
}
