public class Solution {
    public int lengthOfLastWord(String s) {
        int i = 0;
        int j = 0;
        while (i < s.length()) {
            if (s.charAt(s.length()-i-1) != ' ') {
                j ++;
            }
            if (s.charAt(s.length()-i-1) == ' ' && j != 0) {
                return j;
            }
            i ++;
        }
        return j;
    }
}
