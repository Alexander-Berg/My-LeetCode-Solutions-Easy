import org.junit.Test;
import static org.junit.Assert.*;

public class PlusOneTest {

    @Test
    public void testPlusOneNormal() {
        int[] input = {1, 2, 3};
        int[] expected = {1, 2, 4};
        assertArrayEquals(expected, new PlusOne().new Solution().plusOne(input));
    }

    @Test
    public void testPlusOneCarryOver() {
        int[] input = {1, 9, 9};
        int[] expected = {2, 0, 0};
        assertArrayEquals(expected, new PlusOne().new Solution().plusOne(input));
    }

}