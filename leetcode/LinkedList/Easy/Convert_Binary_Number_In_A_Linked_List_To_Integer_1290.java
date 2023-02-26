package leetcode.LinkedList.Easy;

import java.util.LinkedList;

import leetcode.ARRAY.Easy.ListNode;

public class Convert_Binary_Number_In_A_Linked_List_To_Integer_1290 {
    static int getDecimalValue(ListNode head) {
        int res = 0;

        while (head != null) {
            res = res * 2 + head.val;
            head = head.next;
        }
        return res;
    }

    public static void main(String[] args) {
        System.out.println(getDecimalValue(null));
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.addFirst(0);
        list.addFirst(1);
        list.addLast(1);
        System.out.println(list);
    }
}
