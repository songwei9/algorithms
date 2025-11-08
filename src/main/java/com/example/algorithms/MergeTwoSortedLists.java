package com.example.algorithms;

public class MergeTwoSortedLists {
    /** 合并两个升序链表，返回合并后的链表。时间 O(n+m)、空间 O(1)（就地合并） */
    public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curr.next = l1;
                l1 = l1.next;
            } else {
                curr.next = l2;
                l2 = l2.next;
            }
            curr = curr.next;
        }
        curr.next = (l1 != null ? l1 : l2);
        return dummy.next;
    }
}
