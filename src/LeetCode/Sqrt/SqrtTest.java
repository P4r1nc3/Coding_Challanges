package LeetCode.Sqrt;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SqrtTest {
    @Test
    public void test() {
        Sqrt sqrt = new Sqrt();

        assertEquals(2, sqrt.mySqrt(4));
        assertEquals(2, sqrt.mySqrt(8));
        assertEquals(3, sqrt.mySqrt(9));
    }
}
