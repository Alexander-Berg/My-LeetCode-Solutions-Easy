import org.junit.Test;
import static org.junit.Assert.*;

public class PowerofThreeTest {
    @Test
    public void testIsPowerOfThree() {
        PowerofThree.Solution solution = new PowerofThree.Solution();
        assertTrue(solution.isPowerOfThree(1));
        assertTrue(solution.isPowerOfThree(3));
        assertTrue(solution.isPowerOfThree(9));
        assertTrue(solution.isPowerOfThree(27));
        assertTrue(solution.isPowerOfThree(81));
        assertFalse(solution.isPowerOfThree(2));
        assertFalse(solution.isPowerOfThree(4));
        assertFalse(solution.isPowerOfThree(10));
        assertFalse(solution.isPowerOfThree(100));
    }
}
