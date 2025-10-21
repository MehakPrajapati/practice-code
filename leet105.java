package leetcode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
public class leet105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return createTree(preorder, inorder, 0, inorder.length - 1, 0, preorder.length - 1);
    }

    private TreeNode createTree(int[] pre, int[] in, int inStart, int inEnd, int preStart, int preEnd) {
        if (preStart > preEnd || inStart > inEnd) {
            return null;
        }
        TreeNode root = new TreeNode(pre[preStart]);

        int idx = -1;
        for (int i = inStart; i <= inEnd; i++) {
            if (in[i] == root.val) {
                idx = i;
                break;
            }
        }

        int leftSize = idx - inStart;

        // left subtree
        root.left = createTree(pre, in, inStart, idx - 1, preStart + 1, preStart + leftSize);

        // right subtree
        root.right = createTree(pre, in, idx + 1, inEnd, preStart + leftSize + 1, preEnd);

        return root;
    }
}

