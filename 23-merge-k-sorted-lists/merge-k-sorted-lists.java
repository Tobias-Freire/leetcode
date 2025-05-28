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
    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        List<ListNode> validLists = new ArrayList<>();
        for (ListNode node : lists) {
            if (node != null) {
                validLists.add(node);
            }
        }

        if (validLists.isEmpty()) {
            return null;
        }

        ListNode result = validLists.get(0);
        for (int i = 1; i < validLists.size(); i++) {
            result = merge2Lists(result, validLists.get(i));
        }

        return result;
    }

    public ListNode merge2Lists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode tail = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            } else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }

        if (list1 != null) {
            tail.next = list1;
        } else {
            tail.next = list2;
        }

        return dummy.next;
    }
}