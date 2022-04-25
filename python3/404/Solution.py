# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumOfLeftLeaves(self, root: Optional[TreeNode]) -> int:
        if root is None:
            return 0

        left_child = root.left
        right_child = root.right

        if left_child is not None and left_child.left is None and left_child.right is None:
            return left_child.val + self.sumOfLeftLeaves(right_child)

        return self.sumOfLeftLeaves(left_child) + self.sumOfLeftLeaves(right_child)

