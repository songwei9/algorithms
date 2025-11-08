package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RemoveNthFromEndTest {
    private ListNode toList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (int v : arr) {
            p.next = new ListNode(v);
            p = p.next;
        }
        return dummy.next;
    }

    private int[] toArray(ListNode head) {
        java.util.List<Integer> list = new java.util.ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
        return list.stream().mapToInt(i->i).toArray();
    }

    @Test
    void testRemoveNthFromEndMiddle() {
        ListNode head = toList(new int[]{1,2,3,4,5});
        ListNode res = RemoveNthFromEnd.removeNthFromEnd(head, 2);
        assertArrayEquals(new int[]{1,2,3,5}, toArray(res));
    }

    @Test
    void testRemoveNthFromEndHead() {
        ListNode head = toList(new int[]{1,2});
        ListNode res = RemoveNthFromEnd.removeNthFromEnd(head, 2);
        assertArrayEquals(new int[]{2}, toArray(res));
    }

    @Test
    void testRemoveNthFromEndSingleNode() {
        ListNode head = toList(new int[]{1});
        ListNode res = RemoveNthFromEnd.removeNthFromEnd(head, 1);
        assertNull(res);
    }

    @Test
    void testRemoveNthFromEndInvalidN() {
        ListNode head = toList(new int[]{1,2,3});
        assertThrows(IllegalArgumentException.class, () -> RemoveNthFromEnd.removeNthFromEnd(head, 4));
    }
}
