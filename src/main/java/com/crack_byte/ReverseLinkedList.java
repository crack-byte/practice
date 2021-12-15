package com.crack_byte;

public class ReverseLinkedList {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        ListNode root = new ListNode(1), temp = root;
        for (int num : nums) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        reverseList(root);
    }

    public static ListNode reverseList(ListNode head) {
        ListNode t = null, t1 = null;
        while (head != null) {
            if (t == null) {
                t = head;
                t1 = head.next;
                t.next = null;
            } else {
                ListNode t2 = t;
                t1 = head.next;
                t = head;
                t.next = t2;
            }
            head = t1;
        }
        return t;
    }
}
