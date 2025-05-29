/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) { return null; }
        ListNode aux = head;
        while(aux.next != null) {
            if (aux.next.val == aux.val && aux.next.next == null) {
                aux.next = null;
                break;
            } else if (aux.next.val == aux.val) {
                aux.next = aux.next.next;
            }
            if (aux.next.val != aux.val) {
                aux = aux.next;
            }
        }
        return head;
    }
}