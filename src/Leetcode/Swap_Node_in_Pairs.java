package Leetcode;

class listNode {
    int val;
    listNode next;

    // Constructor
    listNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Swap_Node_in_Pairs {
    // Method to swap adjacent pairs in the linked list
    public listNode swapPairs(listNode head) {
        // Create a dummy node that helps simplify edge cases (like swapping the first pair)
        listNode dummy = new listNode(0);
        dummy.next = head;

        // Call the recursive method to perform swaps starting from the dummy node
        swap(dummy);

        // Return the head of the modified list (dummy.next)
        return dummy.next;
    }

    // Recursive method to swap pairs of nodes
    void swap(listNode node) {
        if (node == null) {
            return; // Base case: if node is null, stop recursion
        }

        // First node to be swapped
        listNode first = node.next;

        // Second node to be swapped (if exists)
        listNode second = null;
        if (first != null) {
            second = first.next;
        }

        // If both first and second nodes exist, perform the swap
        if (second != null) {
            // Save the node after the second node (to link later)
            listNode secondNext = second.next;

            // Update pointers to perform the swap
            second.next = first;
            node.next = second;
            first.next = secondNext;

            // Recursive call for the next pair
            swap(first);
        }
    }

    public static void main(String[] args) {
        // Create a linked list: 1 -> 2 -> 3 -> 4
        listNode head = new listNode(1);
        head.next = new listNode(2);
        head.next.next = new listNode(3);
        head.next.next.next = new listNode(4);

        // Print original list
        System.out.print("Original List: ");
        printList(head);

        // Call the swapPairs method
        Swap_Node_in_Pairs solution = new Swap_Node_in_Pairs();
        listNode swappedHead = solution.swapPairs(head);

        // Print swapped list
        System.out.print("Swapped List: ");
        printList(swappedHead);
    }

    // Helper method to print the linked list
    static void printList(listNode head) {
        listNode current = head;
        while (current != null) {
            System.out.print(current.val + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
