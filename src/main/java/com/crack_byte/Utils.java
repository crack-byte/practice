package com.crack_byte;

public class Utils {
    public static ListNode createLinkedList(int... nums) {
        int i = 0;
        ListNode root = new ListNode(nums[i++]), temp = root;
        while (i < nums.length) {
            temp.next = new ListNode(nums[i]);
            temp = temp.next;
            ++i;
        }
        return root;
    }
}
