import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PalindromeNumberTest {

    @Test
    public void testIsPalindromePositive() {
        // Test positive palindromes
        assertTrue(PalindromeNumber.Solution.isPalindrome(0));
        assertTrue(PalindromeNumber.Solution.isPalindrome(121));
        assertTrue(PalindromeNumber.Solution.isPalindrome(12321));
        assertTrue(PalindromeNumber.Solution.isPalindrome(1234321));
    }

    @Test
    public void testIsPalindromeNegative() {
        // Test non-palindromes
        assertFalse(PalindromeNumber.Solution.isPalindrome(-121));
        assertFalse(PalindromeNumber.Solution.isPalindrome(123));
        assertFalse(PalindromeNumber.Solution.isPalindrome(123456));
    }

    @Test
    public void testIsPalindromeEdgeCases() {
        // Test edge cases
        assertFalse(PalindromeNumber.Solution.isPalindrome(Integer.MAX_VALUE));
        assertFalse(PalindromeNumber.Solution.isPalindrome(-2147483648));
    }
}

