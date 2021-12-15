package com.crack_byte;

public class RemoveLinkedListElements {
    public static void main(String[] args) {
        ListNode root = new ListNode(1, new ListNode(2, new ListNode(2, new ListNode(1))));
        removeElements(root, 2);
    }

    public static ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head != null && head.val == val) {
            head = head.next;
        }
        ListNode t = head;
        while (t != null) {
            while (t.next != null && t.next.val == val) {
                t.next = t.next.next;
            }
            t = t.next;
        }
        return head;
    }
}
