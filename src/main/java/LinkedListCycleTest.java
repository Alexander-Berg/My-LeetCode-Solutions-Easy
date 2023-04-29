import org.junit.Test;

import static org.junit.Assert.*;

public class LinkedListCycleTest {
    @Test
    public void testHasCycle_returnsFalse_forEmptyList() {
        LinkedListCycle.Solution solution = new LinkedListCycle().new Solution();
        assertFalse(solution.hasCycle(null));
    }

    @Test
    public void testHasCycle_returnsFalse_forListWithoutCycle() {
        LinkedListCycle.Solution solution = new LinkedListCycle().new Solution();
        LinkedListCycle.ListNode node1 = new LinkedListCycle().new ListNode(1);
        LinkedListCycle.ListNode node2 = new LinkedListCycle().new ListNode(2);
        LinkedListCycle.ListNode node3 = new LinkedListCycle().new ListNode(3);
        LinkedListCycle.ListNode node4 = new LinkedListCycle().new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;

        assertFalse(solution.hasCycle(node1));
    }

    @Test
    public void testHasCycle_returnsTrue_forListWithCycle() {
        LinkedListCycle.Solution solution = new LinkedListCycle().new Solution();
        LinkedListCycle.ListNode node1 = new LinkedListCycle().new ListNode(1);
        LinkedListCycle.ListNode node2 = new LinkedListCycle().new ListNode(2);
        LinkedListCycle.ListNode node3 = new LinkedListCycle().new ListNode(3);
        LinkedListCycle.ListNode node4 = new LinkedListCycle().new ListNode(4);

        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node2; // create cycle

        assertTrue(solution.hasCycle(node1));
    }

    @Test
    public void testHasCycle_returnsTrue_forListWithCycleAtStart() {
        LinkedListCycle.Solution solution = new LinkedListCycle().new Solution();
        LinkedListCycle.ListNode node1 = new LinkedListCycle().new ListNode(1);
        LinkedListCycle.ListNode node2 = new LinkedListCycle().new ListNode(2);
        LinkedListCycle.ListNode node3 = new LinkedListCycle().new ListNode(3);
        LinkedListCycle.ListNode node4 = new LinkedListCycle().new ListNode(4);

        node1.next = node1; // create cycle

        assertTrue(solution.hasCycle(node1));
    }
}
