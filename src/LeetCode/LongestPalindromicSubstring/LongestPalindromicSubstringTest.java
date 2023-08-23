package LeetCode.LongestPalindromicSubstring;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class LongestPalindromicSubstringTest {
    @Test
    public void test() {
        LongestPalindromicSubstring longestPalindromicSubstring = new LongestPalindromicSubstring();

        assertEquals("bab", longestPalindromicSubstring.longestPalindrome("babad"));
        assertEquals("bb", longestPalindromicSubstring.longestPalindrome("cbbd"));
    }
}
