import org.junit.Test;
import static org.junit.Assert.*;

public class MissingNumberTest {

    @Test
    public void testMissingNumber() {
        MissingNumber mn = new MissingNumber();
        int[] nums1 = {3, 0, 1};
        assertEquals(2, mn.new Solution().missingNumber(nums1));

        int[] nums2 = {0, 1};
        assertEquals(2, mn.new Solution().missingNumber(nums2));

        int[] nums3 = {9, 6, 4, 2, 3, 5, 7, 0, 1};
        assertEquals(8, mn.new Solution().missingNumber(nums3));

        int[] nums4 = {0};
        assertEquals(1, mn.new Solution().missingNumber(nums4));
    }
}

