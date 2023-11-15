package CodeWars.DoubleChar;

public class DoubleChar {
    public static String doubleChar(String s){
        StringBuilder result = new StringBuilder();
        for(char c : s.toCharArray()) {
            result.append(c).append(c);
        }
        return result.toString();
    }
}
