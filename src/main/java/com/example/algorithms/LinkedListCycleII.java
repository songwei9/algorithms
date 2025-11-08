package com.example.algorithms;

public class LinkedListCycleII {
    /** 给定链表头节点 head，如果链表中存在环则返回进入环的第一个节点；否则返回 null。
     * 最优解：使用快慢指针 + 相遇后从头再一步步走找入口，时间 O(n)、空间 O(1) */
    public static ListNode detectCycle(ListNode head) {
        if (head == null) return null;
        ListNode slow = head, fast = head;
        boolean hasCycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                hasCycle = true;
                break;
            }
        }
        if (!hasCycle) return null;
        ListNode ptr1 = head, ptr2 = slow;
        while (ptr1 != ptr2) {
            ptr1 = ptr1.next;
            ptr2 = ptr2.next;
        }
        return ptr1;
    }
}
