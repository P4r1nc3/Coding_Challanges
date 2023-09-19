package LeetCode.ValidPalindrome;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class ValidPalindromeTest {
    @Test
    public void test() {
        ValidPalindrome validPalindrome = new ValidPalindrome();

        assertEquals(true, validPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
        assertEquals(false, validPalindrome.isPalindrome("race a car"));
        assertEquals(true, validPalindrome.isPalindrome(""));
    }
}
