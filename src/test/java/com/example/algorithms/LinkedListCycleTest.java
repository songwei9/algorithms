package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleTest {
    private ListNode toList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode p = dummy;
        for (int v : arr) {
            p.next = new ListNode(v);
            p = p.next;
        }
        return dummy.next;
    }

    @Test
    void testHasCycleFalse() {
        ListNode head = toList(new int[]{3,2,0,-4});
        assertFalse(LinkedListCycle.hasCycle(head));
    }

    @Test
    void testHasCycleTrue() {
        ListNode head = toList(new int[]{3,2,0,-4});
        // create a cycle: last node points to second node
        ListNode tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = head.next;
        assertTrue(LinkedListCycle.hasCycle(head));
    }
}
