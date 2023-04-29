import org.junit.Test;
import static org.junit.Assert.*;

public class HappyNumberTest {

    @Test
    public void testHappyNumber() {
        HappyNumber.Solution solution = new HappyNumber().new Solution();

        assertTrue(solution.isHappy(19));
        assertTrue(solution.isHappy(7));
        assertFalse(solution.isHappy(2));
        assertFalse(solution.isHappy(4));
    }

    @Test
    public void testGetNext() {
        HappyNumber.Solution solution = new HappyNumber().new Solution();

        assertEquals(4, solution.getNext(2));
      //  assertEquals(20, solution.getNext(4));
       // assertEquals(4, solution.getNext(16));
     //   assertEquals(37, solution.getNext(58));
    }
}
