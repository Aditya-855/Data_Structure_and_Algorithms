package Leetcode;

class ListNode {
    int val;
    listNode next;
    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class Merge_Two_Sorted_List  {
    public listNode mergeTwoLists(listNode l1, listNode l2) {
        // Create a dummy node to serve as the start of the merged list
        listNode dummy = new listNode(0);
        listNode curr = dummy;

        // Traverse both lists as long as neither is exhausted
        while (l1 != null && l2 != null) {
            // Compare the current values of both lists and attach the smaller node to the merged list
            if (l1.val <= l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            // Move the current pointer to the next node in the merged list
            curr = curr.next;
        }

        // After the loop, attach the remaining nodes from either l1 or l2
        curr.next = (l1 != null) ? l1 : l2;

        // Return the merged list starting from the first actual node (skipping the dummy node)
        return dummy.next;
    }

    public static void main(String[] args) {
        // Create first linked list: 1 -> 2 -> 4
        listNode l1 = new listNode(1);
        l1.next = new listNode(2);
        l1.next.next = new listNode(4);

        // Create second linked list: 1 -> 3 -> 4
        listNode l2 = new listNode(1);
        l2.next = new listNode(3);
        l2.next.next = new listNode(4);

        // Create an instance of Solution and call mergeTwoLists
        Merge_Two_Sorted_List solution = new Merge_Two_Sorted_List();
        listNode mergedList = solution.mergeTwoLists(l1, l2);

        // Print the merged list: 1 -> 1 -> 2 -> 3 -> 4 -> 4
        printList(mergedList);
    }

    // Helper method to print a linked list
    public static void printList(listNode head) {
        listNode current = head;
        while (current != null) {
            System.out.print(current.val + " ");
            current = current.next;
        }
        System.out.println();  // Move to the next line after printing the list
    }
}
