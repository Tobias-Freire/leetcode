# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, x):
#         self.val = x
#         self.next = None

class Solution:
    def hasCycle(self, head: Optional[ListNode]) -> bool:
        if (head == None) or (head.next == None):
            return False
        
        visited = []
        cursor = head
        while(True):
            if cursor.next == None:
                break
            visited.append(cursor)
            cursor = cursor.next
            if cursor in visited:
                return True
        
        return False
        