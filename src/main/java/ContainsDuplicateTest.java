import org.junit.Test;
import static org.junit.Assert.*;

public class ContainsDuplicateTest {

    @Test
    public void testContainsDuplicate() {
        ContainsDuplicate.Solution solution = new ContainsDuplicate().new Solution();

        int[] nums1 = {1, 2, 3, 4, 5};
        assertFalse(solution.containsDuplicate(nums1));

        int[] nums2 = {1, 2, 3, 4, 5, 1};
        assertTrue(solution.containsDuplicate(nums2));

        int[] nums3 = {1, 1, 1, 3, 3, 4, 3, 2, 4, 2};
        assertTrue(solution.containsDuplicate(nums3));

        int[] nums4 = {1, 2, 3, 4};
        assertFalse(solution.containsDuplicate(nums4));
    }
}
