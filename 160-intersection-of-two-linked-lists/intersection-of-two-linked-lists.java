/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        if (headA == null || headB == null) return null;

        // Map to check which nodes are present in the A list
        HashMap<ListNode, Boolean> map = new HashMap<>();

        // Iterate over the A list and add nodes to the map
        if (headA.next == null) map.put(headA, true);
        ListNode auxA = headA;
        while (auxA.next != null) {
            map.put(auxA, true);
            auxA = auxA.next;
        }
        map.put(auxA, true);

        // Iterate over the B list and check if there is an intersection node
        ListNode auxB = headB;
        while (auxB.next != null) {
            if (map.get(auxB) != null) return auxB;

            auxB = auxB.next;
        }
        if (map.get(auxB) != null) return auxB;

        return null;
    }
}