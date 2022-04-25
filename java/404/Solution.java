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
class Solution {
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) {
            return 0;
        }

        TreeNode leftChild = root.left;
        TreeNode rightChild = root.right;

        if (leftChild != null
            && leftChild.left == null
            && leftChild.right == null) {
            return leftChild.val + this.sumOfLeftLeaves(rightChild);
        }

        return this.sumOfLeftLeaves(leftChild) + this.sumOfLeftLeaves(rightChild);
    }
}

