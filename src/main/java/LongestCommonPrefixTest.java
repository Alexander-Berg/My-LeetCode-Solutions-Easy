import org.junit.Test;
import static org.junit.Assert.*;

public class LongestCommonPrefixTest {

    @Test
    public void testLongestCommonPrefix() {
        LongestCommonPrefix.Solution solution = new LongestCommonPrefix().new Solution();

        String[] input1 = {"flower", "flow", "flight"};
        String expected1 = "fl";
        String result1 = solution.longestCommonPrefix(input1);
        assertEquals(expected1, result1);

        String[] input2 = {"dog", "racecar", "car"};
        String expected2 = "";
        String result2 = solution.longestCommonPrefix(input2);
        assertEquals(expected2, result2);

        String[] input3 = {"hello", "helium", "hello world"};
        String expected3 = "hel";
        String result3 = solution.longestCommonPrefix(input3);
        assertEquals(expected3, result3);
    }
}
