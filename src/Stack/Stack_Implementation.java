package Stack;

public class Stack_Implementation {
    private int arr[];
    private int top;
    private int capacity;

    //Creating a Stack
    Stack_Implementation(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    //Add Elements into Stack
    public void push(int x){
        if (isFull()){
            System.out.println("OverFlow\nProgram Terminated");
            System.exit(-1);
        }
        System.out.println("Inserting "+x);
        arr[++top]=x;
    }

    //Remove Elements From Stack
    public int pop(){
        if(isEmpty()){
            System.out.println("STACK EMPTY");
            System.exit(1);
        }
        return arr[top--];
    }

    //
    public int size(){
        return top + 1;
    }
    //Check if the Stack is Empty
    public boolean isEmpty(){
        return top==-1;
    }

    //Check if the Stack is Full
    public boolean isFull(){
        return top==capacity-1;
    }

    public void printStack(){
        for (int i=0;i<=top;i++){
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        Stack_Implementation SI=new Stack_Implementation(5);

        SI.push(1);
        SI.push(2);
        SI.push(3);
        SI.push(4);
        SI.push(5);

        SI.pop();
        System.out.println("\nAfter Popping Out");

        SI.printStack();



    }
}
