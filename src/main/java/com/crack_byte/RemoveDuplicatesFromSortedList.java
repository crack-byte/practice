package com.crack_byte;

public class RemoveDuplicatesFromSortedList {
    public static void main(String[] args) {
        int[] nums = {1, 1, 2};
        ListNode root = new ListNode(1), temp = root;
        for (int num : nums) {
            temp.next = new ListNode(num);
            temp = temp.next;
        }
        System.out.println(deleteDuplicates(root));
    }

    public static ListNode deleteDuplicates(ListNode head) {
        ListNode t = head;
        while (t != null && t.next != null && t.next.val == t.val) {
            t = t.next;
        }
        while (t != null) {
            while (t.next != null && t.next.val == t.val) {
                t.next = t.next.next;
            }
            t = t.next;
        }
        return head;
    }
}
