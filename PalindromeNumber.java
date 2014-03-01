public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        } else if (x < 10) {
            return true;
        } else {
            int b = 10;
            int n = 2;
            while ( x / b > 9) {
                b *= 10;
                n ++;
            }
            int y = x;
            for (int i = 0; i < n/2; i ++) {
                if (x % 10 == y / b) {
                    x /= 10;
                    y = y % b;
                    b /= 10;
                } else {
                    return false;
                }
            }
            return true;
        }
        
    }
}
