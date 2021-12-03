package com.crack_byte;

public class OddEvenLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);
        oddEvenList(head);
    }

    // Todo need to do this not yet complete
    public static ListNode oddEvenList(ListNode head) {
        boolean bool = false;
        ListNode t = head;
        ListNode t1 = head;
        ListNode odd = new ListNode();
        ListNode odd1 = odd;
        while (t != null) {
            if (bool) {
                odd1.val = t.val;
                if (t.next != null && t.next.next != null) {
                    odd1.next = new ListNode();
                    odd1 = odd1.next;
                }
            }
            bool = !bool;
            if (t.next == null) {
                t.next = odd;
                break;
            }
            t = t.next;
        }
        return null;
    }
}

