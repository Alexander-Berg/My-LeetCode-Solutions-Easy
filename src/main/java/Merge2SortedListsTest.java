import org.junit.Test;
import static org.junit.Assert.*;

public class Merge2SortedListsTest {

    @Test
    public void testMergeTwoLists() {
        Merge2SortedLists mergeLists = new Merge2SortedLists();
        Merge2SortedLists.ListNode l1 = mergeLists.new ListNode(1);
        l1.next = mergeLists.new ListNode(3);
        l1.next.next = mergeLists.new ListNode(5);

        Merge2SortedLists.ListNode l2 = mergeLists.new ListNode(2);
        l2.next = mergeLists.new ListNode(4);
        l2.next.next = mergeLists.new ListNode(6);

        Merge2SortedLists.ListNode expected = mergeLists.new ListNode(1);
        expected.next = mergeLists.new ListNode(2);
        expected.next.next = mergeLists.new ListNode(3);
        expected.next.next.next = mergeLists.new ListNode(4);
        expected.next.next.next.next = mergeLists.new ListNode(5);
        expected.next.next.next.next.next = mergeLists.new ListNode(6);

        Merge2SortedLists.Solution solution = mergeLists.new Solution();
        Merge2SortedLists.ListNode merged = solution.mergeTwoLists(l1, l2);

        while (merged != null && expected != null) {
            assertEquals(expected.val, merged.val);
            merged = merged.next;
            expected = expected.next;
        }
    }
}

// This test case checks if two sorted linked lists l1 and l2 are correctly merged into a single sorted list using the mergeTwoLists method of the Merge2SortedLists class. The expected merged list is compared with the actual merged list, element by element, using the assertEquals method from JUnit.
