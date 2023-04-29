import org.junit.Test;
import static org.junit.Assert.*;

public class MajorityElementTest {

    @Test
    public void testMajorityElement() {
        MajorityElement.Solution solution = new MajorityElement().new Solution();

        int[] nums1 = {3,2,3};
        assertEquals(3, solution.majorityElement(nums1));

        int[] nums2 = {2,2,1,1,1,2,2};
        assertEquals(2, solution.majorityElement(nums2));

        int[] nums3 = {1,2,3,4,5};
        //assertEquals(-1, solution.majorityElement(nums3));
    }
}
