package CodeWars.DescendingOrder;

import java.util.Arrays;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        char[] digits = String.valueOf(num).toCharArray();

        Arrays.sort(digits);
        StringBuilder sortedNum = new StringBuilder(new String(digits));

        return Integer.parseInt(sortedNum.reverse().toString());
    }
}
