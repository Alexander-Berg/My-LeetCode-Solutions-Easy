import org.junit.Test;
import static org.junit.Assert.*;

public class ReversedLinkedListTest {

    @Test
    public void testReverseList_withEmptyList() {
        ReversedLinkedList.Solution solution = new ReversedLinkedList().new Solution();
        ReversedLinkedList.ListNode head = null;
        ReversedLinkedList.ListNode expected = null;
        ReversedLinkedList.ListNode actual = solution.reverseList(head);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseList_withSingleElementList() {
        ReversedLinkedList.Solution solution = new ReversedLinkedList().new Solution();
        ReversedLinkedList.ListNode head = new ReversedLinkedList().new ListNode(1);
        ReversedLinkedList.ListNode expected = new ReversedLinkedList().new ListNode(1);
        ReversedLinkedList.ListNode actual = solution.reverseList(head);
        assertEquals(expected.val, actual.val);
    }

    @Test
    public void testReverseList_withMultipleElementList() {
        ReversedLinkedList.Solution solution = new ReversedLinkedList().new Solution();
        ReversedLinkedList.ListNode head = new ReversedLinkedList().new ListNode(1);
        head.next = new ReversedLinkedList().new ListNode(2);
        head.next.next = new ReversedLinkedList().new ListNode(3);
        ReversedLinkedList.ListNode expected = new ReversedLinkedList().new ListNode(3);
        expected.next = new ReversedLinkedList().new ListNode(2);
        expected.next.next = new ReversedLinkedList().new ListNode(1);
        ReversedLinkedList.ListNode actual = solution.reverseList(head);
        while (actual != null && expected != null) {
            assertEquals(expected.val, actual.val);
            expected = expected.next;
            actual = actual.next;
        }
        assertNull(expected);
        assertNull(actual);
    }

}
