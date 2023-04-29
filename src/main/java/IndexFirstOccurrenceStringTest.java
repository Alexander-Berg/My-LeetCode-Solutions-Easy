import org.junit.Test;
import static org.junit.Assert.*;

public class IndexFirstOccurrenceStringTest {

    @Test
    public void testStrStr() {
        IndexFirstOccurrenceString.Solution solution = new IndexFirstOccurrenceString().new Solution();

        // Test 1 - haystack and needle are both empty
        //assertEquals(0, solution.strStr("", ""));

        // Test 2 - needle is empty
        assertEquals(0, solution.strStr("hello", ""));

        // Test 3 - haystack is empty
        assertEquals(-1, solution.strStr("", "world"));

        // Test 4 - needle not found in haystack
        assertEquals(-1, solution.strStr("hello", "world"));

        // Test 5 - needle found in haystack
        assertEquals(2, solution.strStr("hello", "ll"));

        // Test 6 - needle is the same as haystack
        assertEquals(0, solution.strStr("hello", "hello"));

        // Test 7 - needle is longer than haystack
        assertEquals(-1, solution.strStr("hello", "hello world"));
    }
}
