package LeetCode.RomanToInteger;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class RomanToIntegerTest {
    @Test
    public void test() {
        RomanToInteger romanToInteger = new RomanToInteger();

        assertEquals(3, romanToInteger.romanToInt("III"));
        assertEquals(58, romanToInteger.romanToInt("LVIII"));
        assertEquals(1994, romanToInteger.romanToInt("MCMXCIV"));
    }
}
