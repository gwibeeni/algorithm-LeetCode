# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def sumRootToLeaf(self, root: Optional[TreeNode]) -> int:
        return self.sumNodeToLeaf(root, 0)

    def sumNodeToLeaf(self, start: Optional[TreeNode], current: int) -> int:
        if start == None:
            return 0

        answer = (current << 1) + start.val

        if start.left == None and start.right == None:
            return answer

        return self.sumNodeToLeaf(start.left, answer) + self.sumNodeToLeaf(start.right, answer)

