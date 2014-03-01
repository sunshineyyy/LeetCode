public class Solution {
    public int singleNumber(int[] A) {
        int result = 0;
        int x;
        int sum;
        for (int i = 0; i < Integer.SIZE; i ++) {
            x = (1 << i);
            sum = 0;
            for (int j = 0; j < A.length; j ++) {
                if ((A[j] & x) == x) {
                    sum ++;
                }
            }
            if (sum % 3 == 1)
                result = x | result;
        }
        return result;
    }
}
