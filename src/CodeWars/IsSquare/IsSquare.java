package CodeWars.IsSquare;

public class IsSquare {
    public static boolean isSquare(int n) {
        try {
            if (n < 0) {
                return false;
            }

            int sqrt = (int) Math.sqrt(n);
            return sqrt * sqrt == n;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
