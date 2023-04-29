import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseBitsTest {

    @Test
    public void testReverseBits_1() {
        ReverseBits.Solution solution = new ReverseBits().new Solution();
        int num = 0b00000010100101000001111010011100;
        int expected = 0b00111001011110000010100101000000;
        int actual = solution.reverseBits(num);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseBits_2() {
        ReverseBits.Solution solution = new ReverseBits().new Solution();
        int num = 0b00000011111111111111111111111111;
        int expected = 0b11111111111111111111111111111110;
        int actual = solution.reverseBits(num);
        //assertEquals(expected, actual);
    }

    @Test
    public void testReverseBits_3() {
        ReverseBits.Solution solution = new ReverseBits().new Solution();
        int num = 0b10000000000000000000000000000000;
        int expected = 0b1;
        int actual = solution.reverseBits(num);
        assertEquals(expected, actual);
    }
}

