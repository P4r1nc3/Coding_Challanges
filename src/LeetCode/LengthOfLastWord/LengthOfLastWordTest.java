package LeetCode.LengthOfLastWord;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LengthOfLastWordTest {
    @Test
    public void testLengthOfLastWord() {
        LengthOfLastWord solution = new LengthOfLastWord();

        // Test Case 1
        String s1 = "Hello World";
        int result1 = solution.lengthOfLastWord(s1);
        assertEquals(5, result1);

        // Test Case 2
        String s2 = "   fly me   to   the moon  ";
        int result2 = solution.lengthOfLastWord(s2);
        assertEquals(4, result2);

        // Test Case 3
        String s3 = "luffy is still joyboy";
        int result3 = solution.lengthOfLastWord(s3);
        assertEquals(6, result3);
    }
}