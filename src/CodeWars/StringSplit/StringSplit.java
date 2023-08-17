package CodeWars.StringSplit;

public class StringSplit {
    public static String[] solution(String s) {
        int length = (s.length() + 1) / 2;

        String[] result = new String[length];

        for (int i = 0; i < length; i++) {
            if (i == length - 1 && s.length() % 2 == 1) {
                result[i] = s.substring(i * 2, i * 2 + 1) + "_";
            } else {
                result[i] = s.substring(i * 2, i * 2 + 2);
            }
        }

        return result;
    }
}
