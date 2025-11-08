package com.example.algorithms;

import java.util.PriorityQueue;

public class MergeKSortedLists {
    /** 给定 k 个升序链表，将它们合并为一个升序链表并返回 。
     *  最优解：使用 优先队列（小顶堆）合并，总结时间 O(N log k)（N 为所有节点总数），空间 O(k) 辅助。 */
    public static ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) return null;
        PriorityQueue<ListNode> heap = new PriorityQueue<>((a, b) -> Integer.compare(a.val, b.val));
        for (ListNode node : lists) {
            if (node != null) heap.offer(node);
        }
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while (!heap.isEmpty()) {
            ListNode node = heap.poll();
            curr.next = node;
            curr = curr.next;
            if (node.next != null) {
                heap.offer(node.next);
            }
        }
        return dummy.next;
    }
}
