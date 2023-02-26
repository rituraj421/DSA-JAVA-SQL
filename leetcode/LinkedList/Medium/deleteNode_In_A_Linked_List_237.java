package leetcode.LinkedList.Medium;

import leetcode.ARRAY.Easy.ListNode;

public class deleteNode_In_A_Linked_List_237 {
    static void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}