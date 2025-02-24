package Leetcode;


// Definition for a binary tree node
class TreeNode1 {
    int val;
    TreeNode1 left, right;

    TreeNode1(int x) {
        val = x;
    }
}

public class Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal {
    int preIdx = 0, postIdx = 0;

    public TreeNode1 constructFromPrePost(int[] preorder, int[] postorder) {
        // Create the root node using the current preorder index
        TreeNode1 root = new TreeNode1(preorder[preIdx]);
        preIdx++;

        // Construct the left subtree if the current node is not the postorder node
        if (root.val != postorder[postIdx]) {
            root.left = constructFromPrePost(preorder, postorder);
        }

        // Construct the right subtree if the current node is not the postorder node
        if (root.val != postorder[postIdx]) {
            root.right = constructFromPrePost(preorder, postorder);
        }

        // Move to the next postorder index
        postIdx++;

        return root;
    }

    // Function to print the tree (Inorder Traversal)
    public void printInorder(TreeNode1 root) {
        if (root == null) return;
        printInorder(root.left);
        System.out.print(root.val + " ");
        printInorder(root.right);
    }

    public static void main(String[] args) {
        Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal sol = new Construct_Binary_Tree_from_Preorder_and_Postorder_Traversal();

        // Example test case
        int[] preorder = {1, 2, 4, 5, 3, 6, 7};
        int[] postorder = {4, 5, 2, 6, 7, 3, 1};

        // Construct the tree
        TreeNode1 root = sol.constructFromPrePost(preorder, postorder);

        // Print inorder traversal to verify the tree structure
        System.out.print("Inorder Traversal of the Constructed Tree: ");
        sol.printInorder(root);
    }
}
