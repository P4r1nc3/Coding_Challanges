package LeetCode.LongestCommonPrefix;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LongestCommonPrefixTest {
    @Test
    public void test() {
        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();

        String[] array1 = {"dog","racecar","car"};
        assertEquals("", longestCommonPrefix.longestCommonPrefix(array1));

        String[] array2 = {"flower","flow","flight"};
        assertEquals("fl", longestCommonPrefix.longestCommonPrefix(array2));
    }
}
