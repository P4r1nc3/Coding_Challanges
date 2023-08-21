package CodeWars.IsSquare;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.util.Random;

public class IsSquareTest {
    @Test
    public void shouldWorkForSomeExamples() throws Exception {
        assertEquals("negative numbers aren't square numbers", false, IsSquare.isSquare(-1));
        assertEquals("0 is a square number (0 * 0)",    true,   IsSquare.isSquare(0));
        assertEquals("3 isn't a square number", false,  IsSquare.isSquare(3));
        assertEquals("4 is a square number (2 * 2)",    true,   IsSquare.isSquare(4));
        assertEquals("25 is a square number (5 * 5)",   true,   IsSquare.isSquare(25));
        assertEquals("26 isn't a square number",false,  IsSquare.isSquare(26));
    }
}
