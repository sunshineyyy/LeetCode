public class Solution {
    public int atoi(String str) {
        int result = 0;
        boolean isResultPositive = true;
        if (str == null || str.length() < 1) {
            return 0;
        }
        int i = 0;
        while (Character.isWhitespace(str.charAt(i))) {
            i ++;
        }
        if (str.charAt(i) == '+') {
            isResultPositive = true;
            i ++;
        }
        if (str.charAt(i) == '-') {
            isResultPositive = false;
            i ++;
        }
        if (!Character.isDigit(str.charAt(i))) {
            return 0;
        }
        while (Character.isDigit(str.charAt(i))) {
            if (isResultPositive && result > Integer.MAX_VALUE / 10 ) {
                return Integer.MAX_VALUE;
            }
            if (!isResultPositive && result > -(Integer.MIN_VALUE / 10) ) {
                return Integer.MIN_VALUE;
            }
            if (isResultPositive && result == Integer.MAX_VALUE / 10 && Character.getNumericValue(str.charAt(i)) >= 7) {
                return Integer.MAX_VALUE;
            }            
            if (!isResultPositive && result == -(Integer.MIN_VALUE / 10) && Character.getNumericValue(str.charAt(i)) >= 8) {
                return Integer.MIN_VALUE;
            }
            result = 10 * result + Character.getNumericValue(str.charAt(i));
            i ++;
            if (i >= str.length())
                break;
        }
        if (isResultPositive)
            return result;
        else 
            return -1 * result;
    }
}
