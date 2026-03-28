class Solution {
     public static int mySqrt(int x) {
        int low = 0;
        int high = x;
        int tmp = 0;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if ((long) mid * mid == x) {
                return mid;
            }else if ((long) mid * mid < x) {
                low = mid + 1;
                tmp = mid;
            }
            else {
                high = mid - 1;
            }
        }

        return tmp;
    }
}