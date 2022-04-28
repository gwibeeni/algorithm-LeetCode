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
    public int sumRootToLeaf(TreeNode root) {
        return sumNodeToLeaf(root, 0);
    }

    private int sumNodeToLeaf(TreeNode start, int current) {
        if (start == null) {
            return 0;
        }

        int answer = (current << 1) + start.val;

        if (start.left == null
           && start.right == null) {
            return answer;
        }

        return sumNodeToLeaf(start.left, answer) + sumNodeToLeaf(start.right, answer);
    }
}

