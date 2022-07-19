package com.crack_byte;

public class ReverseLinkedList {
    public static void main(String[] args) {
        ListNode root = Utils.createLinkedList(1, 2, 3, 4, 5);
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
