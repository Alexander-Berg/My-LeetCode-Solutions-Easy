import org.junit.Test;
import static org.junit.Assert.*;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        ReverseString.Solution solution = new ReverseString().new Solution();

        // Test CRUD state: Empty String
        char[] s = new char[0];
        solution.reverseString(s);
        assertArrayEquals(new char[0], s);

        // Test CRUD state: String with one character
        s = new char[] {'a'};
        solution.reverseString(s);
        assertArrayEquals(new char[] {'a'}, s);

        // Test CRUD state: String with multiple characters
        s = new char[] {'h', 'e', 'l', 'l', 'o'};
        solution.reverseString(s);
        assertArrayEquals(new char[] {'o', 'l', 'l', 'e', 'h'}, s);
    }
}

