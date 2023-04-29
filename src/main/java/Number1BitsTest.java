import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class Number1BitsTest {

    @Test
    public void testHammingWeight() {
        Number1Bits.Solution solution = new Number1Bits.Solution();

        int n1 = 11;
        int expected1 = 3;
        assertEquals(expected1, solution.hammingWeight(n1));

        int n2 = 128;
        int expected2 = 1;
        assertEquals(expected2, solution.hammingWeight(n2));

        int n3 = 0;
        int expected3 = 0;
        assertEquals(expected3, solution.hammingWeight(n3));
    }
}
