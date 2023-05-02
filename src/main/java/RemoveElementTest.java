import org.junit.Test;
import static org.junit.Assert.*;

public class RemoveElementTest {

    @Test
    public void testRemoveElement_EmptyArray() {
        RemoveElement.Solution solution = new RemoveElement().new Solution();
        int[] nums = {};
        int val = 1;
        int expected = 0;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
    }

    @Test
    public void testRemoveElement_NoMatchingValue() {
        RemoveElement.Solution solution = new RemoveElement().new Solution();
        int[] nums = {2, 3, 4};
        int val = 1;
        int expected = 3;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
        assertArrayEquals(new int[]{2, 3, 4}, nums);
    }

    @Test
    public void testRemoveElement_AllMatchingValues() {
        RemoveElement.Solution solution = new RemoveElement().new Solution();
        int[] nums = {1, 1, 1};
        int val = 1;
        int expected = 0;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
        //assertArrayEquals(new int[]{}, nums);
    }

    @Test
    public void testRemoveElement_MixedValues() {
        RemoveElement.Solution solution = new RemoveElement().new Solution();
        int[] nums = {1, 2, 3, 4, 5, 6};
        int val = 2;
        int expected = 5;
        int actual = solution.removeElement(nums, val);
        assertEquals(expected, actual);
        assertArrayEquals(new int[]{1, 3, 4, 5, 6, 6}, nums);
    }
}
