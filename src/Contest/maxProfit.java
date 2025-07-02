package  Contest;
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
public class maxProfit {
    public ListNode reverseEvenLengthGroups(ListNode head) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;
        ListNode curr = head;
        int groupSize = 1;

        while (curr != null) {
            // Step 1: Check how many nodes are left
            ListNode temp = curr;
            int count = 0;
            while (count < groupSize && temp != null) {
                temp = temp.next;
                count++;
            }
            // Step 2: Reverse if even count
            if (count % 2 == 0) {
                // Reverse the next 'count' nodes
                ListNode[] reversed = reverse(curr, count);
                prev.next = reversed[0];
                curr.next = reversed[1];
                prev = curr;
                curr = reversed[1];
            } else {
                // Just move forward 'count' times
                for (int i = 0; i < count; i++) {
                    prev = curr;
                    curr = curr.next;
                }
            }
            groupSize++;
        }
        return dummy.next;
    }

    // Helper function to reverse 'k' nodes and return new head and tail
    private ListNode[] reverse(ListNode head, int k) {
        ListNode prev = null;
        ListNode curr = head;

        for (int i = 0; i < k; i++) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        return new ListNode[]{prev, curr}; // new head and next group's head
    }

    // Utility method to print linked list (for testing)
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    // Example usage
    public static void main(String[] args) {
        maxProfit sol = new maxProfit();

        ListNode head = new ListNode(5);
        head.next = new ListNode(2);
        head.next.next = new ListNode(6);
        head.next.next.next = new ListNode(3);
        head.next.next.next.next = new ListNode(9);
        head.next.next.next.next.next = new ListNode(1);
        head.next.next.next.next.next.next = new ListNode(7);
        head.next.next.next.next.next.next.next = new ListNode(3);
        head.next.next.next.next.next.next.next.next = new ListNode(8);
        head.next.next.next.next.next.next.next.next.next = new ListNode(4);

        ListNode result = sol.reverseEvenLengthGroups(head);
        sol.printList(result);  // Output: 5 6 2 3 9 1 4 8 3 7
    }
}
