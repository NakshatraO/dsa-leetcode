/*
Problem: 9. Palindrome Number

Time Complexity: O(log₁₀ n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(int x) {
        int digit = 0, revNo = 0;
        int dupl = x;

        if(x < 0)
            return false;

        while (x != 0) {
            digit = x % 10;
            x /= 10;
            revNo = revNo * 10 + digit;
        }

        return dupl == revNo;
    }
}