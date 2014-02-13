public class Solution {
    public int sqrt(int x) {
        if (x < 1) {
            return 0;
        } else if (x < 4){
        	return 1;
        }
        else {
            int i = 0;
            int j = x / 2 + 1;  
            while (i <= j) {
                int mid = (i + j) / 2;
                if (mid == x / mid) {
                    return mid;
                } else if (mid <  x / mid) {
                    i = mid + 1;
                } else {
                    j = mid - 1;
                }
            }
            return j;
        }
    }
}
