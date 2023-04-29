import org.junit.Test;
import static org.junit.Assert.*;

public class ValidPalindromeTest {

    @Test
    public void testIsPalindromeWithEmptyString() {
        ValidPalindrome.Solution solution = new ValidPalindrome.Solution();
        assertTrue(solution.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithSingleCharacterString() {
        ValidPalindrome.Solution solution = new ValidPalindrome.Solution();
        assertTrue(solution.isPalindrome("a"));
    }

    @Test
    public void testIsPalindromeWithPalindromeString() {
        ValidPalindrome.Solution solution = new ValidPalindrome.Solution();
        assertTrue(solution.isPalindrome("A man, a plan, a canal: Panama"));
    }

    @Test
    public void testIsPalindromeWithNonPalindromeString() {
        ValidPalindrome.Solution solution = new ValidPalindrome.Solution();
        assertFalse(solution.isPalindrome("race a car"));
    }

    @Test
    public void testIsPalindromeWithNonAlphaNumericString() {
        ValidPalindrome.Solution solution = new ValidPalindrome.Solution();
        assertTrue(solution.isPalindrome("., "));
    }
}
