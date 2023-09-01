// https://leetcode.com/problems/length-of-last-word/description/
package LeetCode.LengthOfLastWord;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String trim = s.trim();
        int afterLastSpaceIndex = trim.lastIndexOf(' ') + 1;
        return trim.length() - afterLastSpaceIndex;
    }
}
