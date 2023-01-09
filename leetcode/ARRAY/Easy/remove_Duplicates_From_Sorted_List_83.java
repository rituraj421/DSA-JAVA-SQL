package leetcode.ARRAY.Easy;

public class remove_Duplicates_From_Sorted_List_83 {
    class Solution {
        public ListNode deleteDuplicates(ListNode head) {
            if (head == null || head.next == null)
                return head;

            ListNode list = head;

            while (list.next != null) {

                if (list.val == list.next.val) {

                    list.next = list.next.next;
                } else {

                    list = list.next;
                }

            }
            return head;
        }
    }
}
