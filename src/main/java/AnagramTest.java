import org.junit.Test;
import static org.junit.Assert.*;

public class AnagramTest {

    @Test
    public void testIsAnagram_True() {
        Anagram.Solution solution = new Anagram().new Solution();
        String s = "anagram";
        String t = "nagaram";
        boolean expected = true;
        boolean actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsAnagram_False() {
        Anagram.Solution solution = new Anagram().new Solution();
        String s = "rat";
        String t = "car";
        boolean expected = false;
        boolean actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsAnagram_EmptyString() {
        Anagram.Solution solution = new Anagram().new Solution();
        String s = "";
        String t = "";
        boolean expected = true;
        boolean actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsAnagram_DifferentLengths() {
        Anagram.Solution solution = new Anagram().new Solution();
        String s = "hello";
        String t = "world";
        boolean expected = false;
        boolean actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

    @Test
    public void testIsAnagram_SameLetterDifferentFrequency() {
        Anagram.Solution solution = new Anagram().new Solution();
        String s = "aab";
        String t = "abb";
        boolean expected = false;
        boolean actual = solution.isAnagram(s, t);
        assertEquals(expected, actual);
    }

}