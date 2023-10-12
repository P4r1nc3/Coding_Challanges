package LeetCode.ReverseWordsInString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ReverseWordsInStringTest {
    @Test
    public void test() {
        ReverseWordsInString reverseWordsInString = new ReverseWordsInString();

        assertEquals("blue is sky the", reverseWordsInString.reverseWords("the sky is blue"));
        assertEquals("world hello", reverseWordsInString.reverseWords("  hello world  "));
        assertEquals("example good a", reverseWordsInString.reverseWords("a good   example"));
    }
}
