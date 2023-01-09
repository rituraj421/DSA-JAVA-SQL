package leetcode.ARRAY.Easy;

public class reverse_Linked_List_206 {
    class Solution {
        public ListNode reverseList(ListNode head) {
            ListNode reversed = new ListNode(-1);
            ListNode node = head;
            while (node != null) {
                ListNode nodeNext = node.next;
                node.next = reversed.next;
                reversed.next = node;
                node = nodeNext;
            }
            return reversed.next;
        }
    }
}
