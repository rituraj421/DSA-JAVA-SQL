package leetcode.LinkedList.Easy;

public class intersection_Of_Two_Linked_Lists_160 {

    // Definition for singly-linked list.
    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            this.val = x;
            this.next = null;
        }
    }

    public class Solution {
        public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
            ListNode A = headA;
            ListNode B = headB;

            while (A != B) {
                if (A != null) {
                    A = A.next;
                } else {
                    A = headB;
                }

                if (B != null) {
                    B = B.next;
                } else {
                    B = headA;
                }
            }

            return B;
        }
    }

    public static void main(String[] args) {
    }
}
