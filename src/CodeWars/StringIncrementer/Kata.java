package CodeWars.StringIncrementer;

public class Kata {
    public static String incrementString(String str) {
        int len = str.length();
        int i = len - 1;
        while (i >= 0 && Character.isDigit(str.charAt(i))) {
            i--;
        }
        String prefix = str.substring(0, i + 1);
        String suffix = str.substring(i + 1);
        if (suffix.isEmpty()) {
            return prefix + "1";
        } else {
            int num = Integer.parseInt(suffix);
            num++;
            String newSuffix = String.format("%0" + suffix.length() + "d", num);
            return prefix + newSuffix;
        }
    }
}
