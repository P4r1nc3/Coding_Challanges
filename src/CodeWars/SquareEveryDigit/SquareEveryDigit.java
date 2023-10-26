package CodeWars.SquareEveryDigit;

public class SquareEveryDigit {
    public static int squareDigits(int n) {
        String number = Integer.toString(n);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < number.length(); i++) {
            int digit = Character.getNumericValue(number.charAt(i));
            int squaredDigit = digit * digit;
            result.append(squaredDigit);
        }
        return Integer.parseInt(result.toString());
    }
}
