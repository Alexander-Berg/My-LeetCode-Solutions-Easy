import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import org.junit.jupiter.api.Test;

public class ArraysIntersectionTest {

    @Test
    void testEmptyArrays() {
        int[] nums1 = {};
        int[] nums2 = {};
        int[] expected = {};
        ArraysIntersection.Solution sol = new ArraysIntersection().new Solution();
        assertArrayEquals(expected, sol.intersect(nums1, nums2));
    }

    @Test
    void testOneEmptyArray() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {};
        int[] expected = {};
        ArraysIntersection.Solution sol = new ArraysIntersection().new Solution();
        assertArrayEquals(expected, sol.intersect(nums1, nums2));
    }

    @Test
    void testNoCommonElements() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {4, 5, 6};
        int[] expected = {};
        ArraysIntersection.Solution sol = new ArraysIntersection().new Solution();
        assertArrayEquals(expected, sol.intersect(nums1, nums2));
    }

    @Test
    void testAllCommonElements() {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {3, 2, 1};
        int[] expected = {1, 2, 3};
        ArraysIntersection.Solution sol = new ArraysIntersection().new Solution();
        assertArrayEquals(expected, sol.intersect(nums1, nums2));
    }

    @Test
    void testSomeCommonElements() {
        int[] nums1 = {1, 2, 2, 3};
        int[] nums2 = {2, 2, 3};
        int[] expected = {2, 2, 3};
        ArraysIntersection.Solution sol = new ArraysIntersection().new Solution();
        assertArrayEquals(expected, sol.intersect(nums1, nums2));
    }

}
