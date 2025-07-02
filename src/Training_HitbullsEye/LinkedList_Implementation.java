package Training_HitbullsEye;

// Linked list operations in Java

public class LinkedList_Implementation {
    Node head;

    // Create a node
    class Node {
        int data;
        Node next;

        Node(int d) {
            data = d;
            next = null;
        }
    }
    // Insert at the beginning
    public void insertAtBeginning(int new_data) {
        // insert the data
        Node new_node = new Node(new_data);
        if(head==null)
        {
            head=new_node;
        }
        else
        {
            new_node.next = head;
            head = new_node;
        }
    }

    // Insert after a node
    public void insertAfter(int pos, int new_data)
    {
        Node newnode = new Node(new_data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node prev=head;
            for(int i=1;i<pos;i++)
            {
                prev=prev.next;
            }
            newnode.next=prev.next;
            prev.next=newnode;
        }

    }

    // Insert at the end
    public void insertAtEnd(int new_data) {
        Node newnode = new Node(new_data);
        if(head==null)
        {
            head=newnode;
        }
        else
        {
            Node last=head;
            while(last.next!=null)
            {
                last=last.next;
            }
            last.next=newnode;
        }


    }


    // Print the linked list
    public void printList() {
        Node tnode = head;
        while (tnode != null) {
            System.out.print(tnode.data + " ");
            tnode = tnode.next;
        }

    }

    public static void main(String[] args) {
        LinkedList_Implementation llist = new LinkedList_Implementation();

        llist.insertAtEnd(1);
        llist.insertAtBeginning(2);
        llist.insertAtBeginning(3);
        llist.insertAtEnd(4);
        llist.insertAfter(2, 5);

        System.out.println("Linked list: ");
        llist.printList();


    }
}