package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LinkedListCycleIITest {
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
    void testDetectCycleNull() {
        assertNull(LinkedListCycleII.detectCycle(null));
    }

    @Test
    void testDetectCycleNoCycle() {
        ListNode head = toList(new int[]{1,2,3,4});
        assertNull(LinkedListCycleII.detectCycle(head));
    }

    @Test
    void testDetectCycleWithCycle() {
        ListNode head = toList(new int[]{3,2,0,-4});
        ListNode tail = head;
        while (tail.next != null) tail = tail.next;
        tail.next = head.next;  // cycle at node with value 2
        ListNode entry = LinkedListCycleII.detectCycle(head);
        assertNotNull(entry);
        assertEquals(2, entry.val);
    }
}
