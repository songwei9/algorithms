package com.example.algorithms;

public class RemoveNthFromEnd {
    /** 给定一个链表，删除其倒数第 n 个节点，并返回头节点。
     *  最优解：双指针（快慢指针），一次遍历，时间 O(L)、空间 O(1) */
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head == null) throw new IllegalArgumentException("head cannot be null");
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode fast = dummy, slow = dummy;
        // fast 前进 n+1 步
        for (int i = 0; i <= n; i++) {
            if (fast == null) throw new IllegalArgumentException("n is too large");
            fast = fast.next;
        }
        // fast 到末尾时，slow 在要删除节点之前
        while (fast != null) {
            fast = fast.next;
            slow = slow.next;
        }
        // 删除 slow.next
        slow.next = slow.next.next;
        return dummy.next;
    }
}
