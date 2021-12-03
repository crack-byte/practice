package com.crack_byte;

public class AddTwoNumbers {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int a = l1.val, b = l2.val;
        int carry = (a + b) / 10;
        ListNode t = new ListNode((a + b) >= 10 ? (a + b - 10) : a + b);
        ListNode t1 = t;
        while (t1 != null) {
            l1 = (l1 == null) ? null : l1.next;
            l2 = (l2 == null) ? null : l2.next;
            if (l1 == null && l2 == null) {
                if (carry > 0) {
                    t1.next = new ListNode(carry);
                }
                t1 = null;
                continue;
            }
            a = (l1 == null) ? 0 : l1.val;
            b = (l2 == null) ? 0 : l2.val;
            t1.next = new ListNode(a + b + carry >= 10 ? a + b + carry - 10 : a + b + carry);
            t1 = t1.next;
            carry = (a + b + carry) / 10;

        }
        return t;
    }
}


