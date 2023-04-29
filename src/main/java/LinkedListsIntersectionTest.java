import org.junit.Test;
import static org.junit.Assert.*;

public class LinkedListsIntersectionTest {

    @Test
    public void testIntersection() {
        // create the intersection node
        LinkedListsIntersection.ListNode intersection = new LinkedListsIntersection.ListNode(8);
        intersection.next = new LinkedListsIntersection.ListNode(4);
        intersection.next.next = new LinkedListsIntersection.ListNode(5);

        // create list A
        LinkedListsIntersection.ListNode listA = new LinkedListsIntersection.ListNode(4);
        listA.next = new LinkedListsIntersection.ListNode(1);
        listA.next.next = intersection;

        // create list B
        LinkedListsIntersection.ListNode listB = new LinkedListsIntersection.ListNode(5);
        listB.next = new LinkedListsIntersection.ListNode(6);
        listB.next.next = new LinkedListsIntersection.ListNode(1);
        listB.next.next.next = intersection;

        // expected intersection node is the same as created above
        LinkedListsIntersection.ListNode expected = intersection;

        // create the solution object and call the method
        LinkedListsIntersection.Solution solution = new LinkedListsIntersection.Solution();
        LinkedListsIntersection.ListNode actual = solution.getIntersectionNode(listA, listB);

        // assert that the expected and actual intersection nodes are the same
        assertEquals(expected, actual);
    }

    @Test
    public void testNoIntersection() {
        // create list A
        LinkedListsIntersection.ListNode listA = new LinkedListsIntersection.ListNode(2);
        listA.next = new LinkedListsIntersection.ListNode(6);
        listA.next.next = new LinkedListsIntersection.ListNode(4);

        // create list B
        LinkedListsIntersection.ListNode listB = new LinkedListsIntersection.ListNode(1);
        listB.next = new LinkedListsIntersection.ListNode(5);

        // expected intersection node is null as there is no intersection
        LinkedListsIntersection.ListNode expected = null;

        // create the solution object and call the method
        LinkedListsIntersection.Solution solution = new LinkedListsIntersection.Solution();
        LinkedListsIntersection.ListNode actual = solution.getIntersectionNode(listA, listB);

        // assert that the expected and actual intersection nodes are the same
        assertEquals(expected, actual);
    }

    @Test
    public void testOneListEmpty() {
        // create list A
        LinkedListsIntersection.ListNode listA = new LinkedListsIntersection.ListNode(1);

        // create empty list B
        LinkedListsIntersection.ListNode listB = null;

        // expected intersection node is null as one of the lists is empty
        LinkedListsIntersection.ListNode expected = null;

        // create the solution object and call the method
        LinkedListsIntersection.Solution solution = new LinkedListsIntersection.Solution();
        LinkedListsIntersection.ListNode actual = solution.getIntersectionNode(listA, listB);

        // assert that the expected and actual intersection nodes are the same
        assertEquals(expected, actual);
    }

}
