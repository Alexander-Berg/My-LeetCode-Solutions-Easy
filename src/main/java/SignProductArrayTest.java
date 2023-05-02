import org.junit.Test;
import static org.junit.Assert.*;



    public class SignProductArrayTest {

        @Test
        public void testArraySign_emptyArray_returns1() {
            int[] nums = {};
            SignProductArray.Solution sol = new SignProductArray().new Solution();
            assertEquals(1, sol.arraySign(nums));
        }

        @Test
        public void testArraySign_singleZero_returns0() {
            int[] nums = {0};
            SignProductArray.Solution sol = new SignProductArray().new Solution();
            assertEquals(0, sol.arraySign(nums));
        }

        @Test
        public void testArraySign_singlePositiveNumber_returns1() {
            int[] nums = {7};
            SignProductArray.Solution sol = new SignProductArray().new Solution();
            assertEquals(1, sol.arraySign(nums));
        }

        @Test
        public void testArraySign_singleNegativeNumber_returnsNegative1() {
            int[] nums = {-7};
            SignProductArray.Solution sol = new SignProductArray().new Solution();
            assertEquals(-1, sol.arraySign(nums));
        }

        @Test
        public void testArraySign_allPositiveNumbers_returns1() {
            int[] nums = {2, 3, 5, 8};
            SignProductArray.Solution sol = new SignProductArray().new Solution();
            assertEquals(1, sol.arraySign(nums));
        }

        @Test
        public void testArraySign_allNegativeNumbers_returnsNegative1() {
            int[] nums = {-2, -3, -5, -8};
            SignProductArray.Solution sol = new SignProductArray().new Solution();
            assertEquals(-1, sol.arraySign(nums));
        }

        @Test
        public void testArraySign_containsZero_returns0() {
            int[] nums = {-2, 0, 5, 8};
            SignProductArray.Solution sol = new SignProductArray().new Solution();
            assertEquals(0, sol.arraySign(nums));
        }

        @Test
        public void testArraySign_containsOddNumberOfNegatives_returnsNegative1() {
            int[] nums = {-2, 3, -5, 8, -4};
            SignProductArray.Solution sol = new SignProductArray().new Solution();
            assertEquals(-1, sol.arraySign(nums));
        }

        @Test
        public void testArraySign_containsEvenNumberOfNegatives_returns1() {
            int[] nums = {-2, 3, -5, 8, -4, -9};
            SignProductArray.Solution sol = new SignProductArray().new Solution();
            assertEquals(1, sol.arraySign(nums));
        }
    }


