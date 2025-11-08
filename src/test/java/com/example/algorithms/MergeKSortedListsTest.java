package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeKSortedListsTest {
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
        return list.stream().mapToInt(i -> i).toArray();
    }

    @Test
    void testMergeKListsNormal() {
        ListNode[] lists = new ListNode[]{
                toList(new int[]{1,4,5}),
                toList(new int[]{1,3,4}),
                toList(new int[]{2,6})
        };
        ListNode result = MergeKSortedLists.mergeKLists(lists);
        assertArrayEquals(new int[]{1,1,2,3,4,4,5,6}, toArray(result));
    }

    @Test
    void testMergeKListsEmpty() {
        ListNode result = MergeKSortedLists.mergeKLists(new ListNode[]{});
        assertNull(result);
    }

    @Test
    void testMergeKListsAllNulls() {
        ListNode result = MergeKSortedLists.mergeKLists(new ListNode[]{null, null});
        assertNull(result);
    }
}
