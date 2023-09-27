package LeetCode.IntegerToRoman;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class IntegerToRomanTest {
    @Test
    public void test() {
        IntegerToRoman integerToRoman = new IntegerToRoman();

        assertEquals("III", integerToRoman.intToRoman(3));
        assertEquals("LVIII", integerToRoman.intToRoman(58));
        assertEquals("MCMXCIV", integerToRoman.intToRoman(1994));
    }
}
