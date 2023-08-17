package CodeWars.PigLatin;

public class PigLatin {
    public static String pigIt(String str) {
        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                char firstLetter = word.charAt(0);
                String restOfWord = word.substring(1);
                result.append(restOfWord).append(firstLetter).append("ay").append(" ");
            } else {
                result.append(word).append(" ");
            }
        }

        return result.toString().trim();
    }
}
