# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def minDepth(self, root: Optional[TreeNode]) -> int:
        minDepth = float('inf')
        currentMinDepth = 0

        return self.aux(root, minDepth, currentMinDepth)

    def aux(self, root: Optional[NodeList], minDepth: int, currentMinDepth: int) -> int:
        if root == None:
            return 0

        if root.left == None and root.right == None:
            currentMinDepth += 1
            if currentMinDepth < minDepth:
                minDepth = currentMinDepth
            currentMinDepth = 0
            return minDepth

        leftMinDepth = self.aux(root.left, minDepth, currentMinDepth+1)
        rightMinDepth = self.aux(root.right, minDepth, currentMinDepth+1)

        if leftMinDepth == 0:
            return rightMinDepth

        if rightMinDepth == 0:
            return leftMinDepth

        return min(leftMinDepth, rightMinDepth)