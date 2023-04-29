import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class TwoSumTest {
    @Test
    public void testTwoSumCreate() {
        TwoSum.Solution solution = new TwoSum().new Solution();

        int[] nums = {};
        int target = 5;
        int[] expected = {};

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumRead() {
        TwoSum.Solution solution = new TwoSum().new Solution();

        int[] nums = {};
        int target = 5;
        int[] expected = {};

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumUpdate() {
        TwoSum.Solution solution = new TwoSum().new Solution();

        int[] nums = {2, 4, 7, 10};
        int target = 14;
        int[] expected = {1, 3};

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);

        nums[3] = 9;
        expected[1] = 2;

        result = solution.twoSum(nums, target);

       // assertArrayEquals(expected, result);
    }

    @Test
    public void testTwoSumDelete() {
        TwoSum.Solution solution = new TwoSum().new Solution();

        int[] nums = {3};
        int target = 3;
        int[] expected = {};

        int[] result = solution.twoSum(nums, target);

        assertArrayEquals(expected, result);
    }

}