package com.example.algorithms;

public class LinkedListCycle {
    /** 给定链表的头节点 head，判断链表中是否存在环。
     *  最优解：使用快慢指针（龟兔赛跑算法），时间 O(n)、空间 O(1) */
    public static boolean hasCycle(ListNode head) {
        if (head == null) return false;
        ListNode slow = head, fast = head.next;
        while (fast != null && fast.next != null) {
            if (slow == fast) return true;
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }
}
