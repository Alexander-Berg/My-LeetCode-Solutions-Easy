import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

public class MoveZeroesTest {
    @Test
    public void testMoveZeroes() {
        MoveZeroes.Solution solution = new MoveZeroes().new Solution();

        int[] nums1 = {0, 1, 0, 3, 12};
        solution.moveZeroes(nums1);
        assertArrayEquals(new int[]{1, 3, 12, 0, 0}, nums1);

        int[] nums2 = {0, 0, 0, 0, 0};
        solution.moveZeroes(nums2);
        assertArrayEquals(new int[]{0, 0, 0, 0, 0}, nums2);

        int[] nums3 = {1, 2, 3, 4, 5};
        solution.moveZeroes(nums3);
        assertArrayEquals(new int[]{1, 2, 3, 4, 5}, nums3);

        int[] nums4 = {0, 0, 1, 0, 2, 0, 3};
        solution.moveZeroes(nums4);
        assertArrayEquals(new int[]{1, 2, 3, 0, 0, 0, 0}, nums4);
    }
}

