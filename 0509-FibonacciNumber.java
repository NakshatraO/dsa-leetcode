/*
Problem: 509. Fibonacci Number

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public int fib(int n) {
        if (n <= 1)
            return n;
        int f1 = 0;
        int f2 = 1;
        int fn = 0;
        for(int i=1 ; i<n ; i++) {
            fn = f1 + f2;
            f1 = f2;
            f2 = fn;
        }
        return fn;
    }
}