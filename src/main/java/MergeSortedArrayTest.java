import org.junit.Test;

import static org.junit.Assert.*;

public class MergeSortedArrayTest {


        @Test
        public void testMerge() {
                MergeSortedArray.Solution solution = new MergeSortedArray().new Solution();

                int[] nums1 = {1, 2, 3, 0, 0, 0};
                int[] nums2 = {2, 5, 6};
                int m = 3, n = 3;
                solution.merge(nums1, m, nums2, n);
                assertArrayEquals(new int[]{1, 2, 2, 3, 5, 6}, nums1);

                nums1 = new int[]{4, 5, 6, 0, 0, 0};
                nums2 = new int[]{1, 2, 3};
                m = 3;
                n = 3;
                solution.merge(nums1, m, nums2, n);
                assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);

                nums1 = new int[]{1, 2, 4, 5, 6, 0};
                nums2 = new int[]{3};
                m = 5;
                n = 1;
                solution.merge(nums1, m, nums2, n);
                assertArrayEquals(new int[]{1, 2, 3, 4, 5, 6}, nums1);
        }
}
