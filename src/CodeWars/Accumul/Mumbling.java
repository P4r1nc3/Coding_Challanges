package CodeWars.Accumul;

public class Mumbling {
    public static String accum(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            result.append(Character.toUpperCase(currentChar));

            for (int j = 0; j < i; j++) {
                result.append(Character.toLowerCase(currentChar));
            }

            if (i < s.length() - 1) {
                result.append("-");
            }
        }
        return result.toString();
    }
}
