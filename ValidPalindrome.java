public class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int i = 0;
        int j = s.length() - 1;
        boolean result = true;
        while (i < j) {
            while (!isAlphanumeric(s.charAt(i)) && i < j){
                i += 1;
            }
            while (!isAlphanumeric(s.charAt(j)) && i < j){
                j -= 1;
            }
            if (i >= j){
                break;
            }
            if (s.charAt(i) != s.charAt(j)){
                result = false;
                break;
            }  else {
                i += 1;
                j -= 1;
            }
        }
        return result;
    }
    public boolean isAlphanumeric(char x) {
        boolean result = false;
        if (Character.isDigit(x) || Character.isAlphabetic(x)){
            result = true;
        }
        return result;
    }
    
}
