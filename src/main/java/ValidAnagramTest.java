import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ValidAnagramTest {
    @Test
    public void testValidAnagrams() {
        ValidAnagram.Solution solution = new ValidAnagram.Solution();

        String s = "listen";
        String t = "silent";
        boolean expected = true;

        boolean result = solution.isAnagram(s, t);

        assertEquals(expected, result);
    }
    @Test
    public void testInvalidAnagrams() {
        ValidAnagram.Solution solution = new ValidAnagram.Solution();

        String s = "hello";
        String t = "world";
        boolean expected = false;

        boolean result = solution.isAnagram(s, t);

        assertEquals(expected, result);
    }
    @Test
    public void testOneEmptyString() {
        ValidAnagram.Solution solution = new ValidAnagram.Solution();

        String s = "";
        String t = "test";
        boolean expected = false;

        boolean result = solution.isAnagram(s, t);

        assertEquals(expected, result);
    }


}