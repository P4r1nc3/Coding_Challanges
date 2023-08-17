package CodeWars.ToCamelCase;

import java.lang.StringBuilder;

class ToCamelCase {

    static String toCamelCase(String s) {
        String[] words = s.split("[-_]");
        StringBuilder result = new StringBuilder();

        result.append(words[0]);

        for (int i = 1; i < words.length; i++) {
            result.append(words[i].substring(0, 1).toUpperCase() + words[i].substring(1));
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String sentence = "The_stealth_Warrior";
        System.out.print(toCamelCase(sentence));
    }
}
