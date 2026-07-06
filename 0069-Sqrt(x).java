/*
Problem: 69. Sqrt(x)

Time Complexity: O(log n)
Space Complexity: O(1)
*/

class Solution {
    public int mySqrt(int x) {
        if (x == 0 || x == 1)
            return x;

        long low = 1;
        long high = x;
        long num = low;

        while (low <= high) {
            long mid = (low + high) / 2;

            if (mid * mid <= x) {
                num = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return (int)num;
    }
}