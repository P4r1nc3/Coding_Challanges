// https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/
package LeetCode.FindTheIndexOfTheFirstOccurrence;

public class FindTheIndexOfTheFirstOccurrence {
    public int strStr(String haystack, String needle) {
        int hLen = haystack.length();
        int nLen = needle.length();
        int nIndex = 0;
        for(int i = 0; i < hLen; i++){
            if(haystack.charAt(i) == needle.charAt(nIndex)){
                nIndex++;
            }
            else{
                i = i - nIndex;
                nIndex = 0;
            }
            if(nIndex == nLen){
                return i - nLen + 1;
            }
        }
        return -1;
    }
}
