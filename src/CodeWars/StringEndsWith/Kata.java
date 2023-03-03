package CodeWars.StringEndsWith;

public class Kata {
    public static boolean solution(String str, String ending) {
        if (ending.length() > str.length()) {
            return false;
        }
        String lastChars = str.substring(str.length() - ending.length());

        return lastChars.equals(ending);
    }
}
