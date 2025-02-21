package Leetcode;

import java.util.HashSet;

// Definition for a binary tree node
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}

public class Find_Elements_in_a_Contaminated_Binary_Tree {
    private HashSet<Integer> st; // A set to store recovered values

    // Helper function to restore the tree and populate the set
    private void dfs(TreeNode root, int x) {
        if (root == null) {
            return;
        }

        root.val = x; // Assign the correct value to the node
        st.add(x); // Store the value in the HashSet

        // Recursively restore the left and right children
        dfs(root.left, 2 * x + 1);
        dfs(root.right, 2 * x + 2);
    }

    // Constructor: Initializes the set and starts the recovery process
    public Find_Elements_in_a_Contaminated_Binary_Tree(TreeNode root) {
        st = new HashSet<>();
        dfs(root, 0); // Start DFS from the root with value 0
    }

    // Checks if the given target value exists in the tree
    public boolean find(int target) {
        return st.contains(target);
    }

    // Main method for testing
    public static void main(String[] args) {
        // Creating a corrupted tree
        TreeNode root = new TreeNode(-1);
        root.left = new TreeNode(-1);
        root.right = new TreeNode(-1);
        root.left.left = new TreeNode(-1);
        root.left.right = new TreeNode(-1);

        // Recover the tree using FindElements
        Find_Elements_in_a_Contaminated_Binary_Tree obj = new Find_Elements_in_a_Contaminated_Binary_Tree(root);

        // Testing the find method
        System.out.println(obj.find(1)); // true (since 1 is left child of 0)
        System.out.println(obj.find(2)); // true (since 2 is right child of 0)
        System.out.println(obj.find(5)); // true (since 5 is right child of 2)
        System.out.println(obj.find(10)); // false (not in the tree)
    }
}
