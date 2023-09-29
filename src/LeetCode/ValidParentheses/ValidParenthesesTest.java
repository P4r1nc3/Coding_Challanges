package LeetCode.ValidParentheses;

import org.junit.Test;

import static org.junit.Assert.*;

public class ValidParenthesesTest {
    @Test
    public void test() {
        ValidParentheses validParentheses = new ValidParentheses();

        assertTrue(validParentheses.isValid("()"));
        assertFalse(validParentheses.isValid("(}"));
        assertTrue(validParentheses.isValid("()[]{}"));
    }
}
