import org.junit.Test;
import static org.junit.Assert.*;

public class ValidParenthesesTest {

    @Test
    public void testValid() {
        ValidParentheses.Solution solution = new ValidParentheses().new Solution();
        assertTrue(solution.isValid(""));
        assertTrue(solution.isValid("()"));
        assertTrue(solution.isValid("()[]{}"));
        assertTrue(solution.isValid("{[()]}"));
    }

    @Test
    public void testInvalid() {
        ValidParentheses.Solution solution = new ValidParentheses().new Solution();
        assertFalse(solution.isValid("("));
        assertFalse(solution.isValid(")"));
        assertFalse(solution.isValid("(]"));
        assertFalse(solution.isValid("([)]"));
        assertFalse(solution.isValid("{{}"));
    }

}

