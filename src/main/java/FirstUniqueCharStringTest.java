import org.junit.Test;
import static org.junit.Assert.*;

public class FirstUniqueCharStringTest {

    @Test
    public void testFirstUniqChar() {
        FirstUniqueCharString.Solution solution = new FirstUniqueCharString().new Solution();

        // Test case 1: string with all unique characters
        String s1 = "abcdefg";
        int expected1 = 0;
        assertEquals(expected1, solution.firstUniqChar(s1));

        // Test case 2: string with repeated characters
        String s2 = "abab";
        int expected2 = -1;
        assertEquals(expected2, solution.firstUniqChar(s2));

        // Test case 3: string with only one character
        String s3 = "a";
        int expected3 = 0;
        assertEquals(expected3, solution.firstUniqChar(s3));

        // Test case 4: empty string
        String s4 = "";
        int expected4 = -1;
        assertEquals(expected4, solution.firstUniqChar(s4));

        // Test case 5: string with only repeated characters
        String s5 = "bbbbbbb";
        int expected5 = -1;
        assertEquals(expected5, solution.firstUniqChar(s5));
    }
}
