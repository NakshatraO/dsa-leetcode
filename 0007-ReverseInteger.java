/*
Problem: 7. Reverse Integer

Time Complexity: O(log₁₀ n)
Space Complexity: O(1)
*/

class Solution {
    public int reverse(int x) {
        long revNo = 0;

        while (x != 0) {
            revNo = revNo * 10 + x % 10;
            x /= 10;
        }

        if (revNo >= Integer.MIN_VALUE && revNo <= Integer.MAX_VALUE)
            return (int) revNo;

        return 0;
    }
}