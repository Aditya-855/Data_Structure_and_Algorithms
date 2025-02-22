package Leetcode;


class Treenode {
    int val;
    Treenode left;
    Treenode right;

    Treenode(int x) {
        val = x;
    }
}

public class Recover_a_Tree_From_Preorder_Traversal {

    int n;  // Length of the traversal string

    // Recursive method to reconstruct the binary tree from preorder traversal
    public Treenode solve(String s, int[] i, int depth) {
        if (i[0] >= n) { // Base case: if index exceeds length, return null
            return null;
        }

        int j = i[0];
        while (j < n && s.charAt(j) == '-') { // Count dashes to determine depth
            j++;
        }
        int dash = j - i[0]; // Number of dashes found

        if (dash != depth) { // If depth doesn't match expected depth, return null (backtrack)
            return null;
        }
        i[0] += dash; // Move index forward

        int num = 0;
        while (i[0] < n && Character.isDigit(s.charAt(i[0]))) { // Extract the number (node value)
            num = (num * 10) + (s.charAt(i[0]) - '0');
            i[0]++;
        }

        Treenode root = new Treenode(num); // Create new node
        root.left = solve(s, i, depth + 1); // Recursively build left subtree
        root.right = solve(s, i, depth + 1); // Recursively build right subtree

        return root;
    }

    // Method to initiate tree reconstruction from traversal string
    public Treenode recoverFromPreorder(String traversal) {
        n = traversal.length(); // Get length of traversal string
        int[] i = {0}; // Array to act as a pointer
        return solve(traversal, i, 0); // Start solving from depth 0
    }

    // Helper method to print tree in preorder
    public void printPreorder(Treenode root) {
        if (root == null) return;
        System.out.print(root.val + " ");
        printPreorder(root.left);
        printPreorder(root.right);
    }

    public static void main(String[] args) {
        Recover_a_Tree_From_Preorder_Traversal solution = new Recover_a_Tree_From_Preorder_Traversal();

        String traversal = "1-2--3--4-5--6--7";  // Example input
        Treenode root = solution.recoverFromPreorder(traversal);

        System.out.println("Preorder traversal of reconstructed tree:");
        solution.printPreorder(root);
    }
}
