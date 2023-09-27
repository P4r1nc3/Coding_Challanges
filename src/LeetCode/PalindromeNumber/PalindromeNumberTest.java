package LeetCode.PalindromeNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeNumberTest {
    @Test
    public void test() {
        PalindromeNumber palindromeNumber = new PalindromeNumber();

        assertEquals(true, palindromeNumber.isPalindrome(121));
        assertEquals(false, palindromeNumber.isPalindrome(-121));
        assertEquals(false, palindromeNumber.isPalindrome(10));
    }
}
