package com.example.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MergeTwoSortedListsTest {
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
    void testMergeTwoSortedListsBothNonEmpty() {
        ListNode l1 = toList(new int[]{1,2,4});
        ListNode l2 = toList(new int[]{1,3,4});
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertArrayEquals(new int[]{1,1,2,3,4,4}, toArray(merged));
    }

    @Test
    void testMergeTwoSortedListsOneEmpty() {
        ListNode l1 = toList(new int[]{});
        ListNode l2 = toList(new int[]{0});
        ListNode merged = MergeTwoSortedLists.mergeTwoLists(l1, l2);
        assertArrayEquals(new int[]{0}, toArray(merged));
    }
}
