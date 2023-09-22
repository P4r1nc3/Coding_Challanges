package LeetCode.FindTheIndexOfTheFirstOccurrence;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class FindTheIndexOfTheFirstOccurrenceTest {
    @Test
    public void test() {
        FindTheIndexOfTheFirstOccurrence findTheIndexOfTheFirstOccurrence = new FindTheIndexOfTheFirstOccurrence();

        assertEquals(0, findTheIndexOfTheFirstOccurrence.strStr("sadbutsad", "sad"));
        assertEquals(-1, findTheIndexOfTheFirstOccurrence.strStr("leetcode", "leeto"));
    }
}
