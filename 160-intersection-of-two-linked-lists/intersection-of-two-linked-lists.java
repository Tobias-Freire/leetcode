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
        HashMap<ListNode, Integer> map = new HashMap<>();

        // Iterate over the A list and add nodes to the map
        if (headA.next == null) map.put(headA, 1);
        ListNode aux = headA;
        while (aux.next != null) {
            map.put(aux, 1);
            aux = aux.next;
        }
        map.put(aux, 1);

        // Iterate over the B list and check if there is an intersection node
        aux = headB;
        while (aux.next != null) {
            if (map.get(aux) != null) return aux;

            aux = aux.next;
        }
        if (map.get(aux) != null) return aux;

        return null;
    }
}