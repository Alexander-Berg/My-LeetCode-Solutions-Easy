import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeLinkedListTest {
    @Test
    public void testIsPalindromeWithValidPalindromeList() {
        PalindromeLinkedList.ListNode node1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode node2 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode node3 = new PalindromeLinkedList.ListNode(3);
        PalindromeLinkedList.ListNode node4 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode node5 = new PalindromeLinkedList.ListNode(1);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        node4.next = node5;
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean actualOutput = palindromeLinkedList.isPalindrome(node1);
        assertTrue(actualOutput);
    }

    @Test
    public void testIsPalindromeWithValidNonPalindromeList() {
        PalindromeLinkedList.ListNode node1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList.ListNode node2 = new PalindromeLinkedList.ListNode(2);
        PalindromeLinkedList.ListNode node3 = new PalindromeLinkedList.ListNode(3);
        PalindromeLinkedList.ListNode node4 = new PalindromeLinkedList.ListNode(4);
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean actualOutput = palindromeLinkedList.isPalindrome(node1);
        assertFalse(actualOutput);
    }

    @Test
    public void testIsPalindromeWithSingleNodeList() {
        PalindromeLinkedList.ListNode node1 = new PalindromeLinkedList.ListNode(1);
        PalindromeLinkedList palindromeLinkedList = new PalindromeLinkedList();
        boolean actualOutput = palindromeLinkedList.isPalindrome(node1);
        assertTrue(actualOutput);
    }
}
