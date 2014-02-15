public class Solution {
    public int reverse(int x) {
        int num = x;
        if (x < 0) {
            num = -x;
        }
        int k = 1;
        while (num / k != 0) {
            k *= 10;
        }
        int revNum = 0;
        int j = 1;
        int digit = k / 10;
        while (j < k) {
            revNum += (num / j) % 10 *digit;
            j *= 10;
            digit /= 10;
        }
        int finalRevNum = revNum;
        if (x < 0) {
            finalRevNum = -revNum;
        }
        return finalRevNum;
    }
}
