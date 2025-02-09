package Leetcode;

import java.util.HashMap;
import java.util.PriorityQueue;

public class Design_a_Number_Container_System {
    private HashMap<Integer, Integer> idxToNum;
    private HashMap<Integer, PriorityQueue<Integer>> numToIdx;

    // Constructor to initialize HashMaps
    public Design_a_Number_Container_System() {
        idxToNum = new HashMap<>();
        numToIdx = new HashMap<>();
    }

    // Change function to update the index with the given number
    public void change(int index, int number) {
        idxToNum.put(index, number); // Store index-number mapping

        // Ensure a priority queue exists for the given number
        numToIdx.putIfAbsent(number, new PriorityQueue<>());

        // Add the index to the priority queue
        numToIdx.get(number).offer(index);
    }

    // Find function to return the smallest index for a given number
    public int find(int number) {
        if (!numToIdx.containsKey(number)) {
            return -1;
        }
        PriorityQueue<Integer> pq = numToIdx.get(number);

        // Clean up stale indices (indices where the number has changed)
        while (!pq.isEmpty()) {
            int idx = pq.peek();
            if (idxToNum.get(idx) == number) {
                return idx; // Return the smallest valid index
            }
            pq.poll(); // Remove stale index
        }
        return -1;
    }

    public static void main(String[] args) {
        // Creating an instance of NumberContainers
        Design_a_Number_Container_System obj = new Design_a_Number_Container_System();

        // Performing operations
        obj.change(1, 10); // Assign number 10 to index 1
        obj.change(2, 10); // Assign number 10 to index 2
        obj.change(3, 20); // Assign number 20 to index 3
        obj.change(4, 10); // Assign number 10 to index 4

        // Finding the smallest index containing a number
        System.out.println(obj.find(10)); // Output: 1 (smallest index for number 10)
        System.out.println(obj.find(20)); // Output: 3 (smallest index for number 20)
        System.out.println(obj.find(30)); // Output: -1 (30 is not present)

        obj.change(1, 30); // Changing index 1 to 30
        System.out.println(obj.find(10)); // Output: 2 (smallest index for number 10 after change)
    }
}
