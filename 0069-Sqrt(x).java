/*
Problem: 69. Sqrt(x)

Time Complexity: O(√n)
Space Complexity: O(1)
*/

class Solution {
    public int mySqrt(int x) {
        if(x <= 0)  return 0;

        if(x == 1 || x == 2 || x == 3)  return 1;
        
        long n = 0, i;
        for(i=2 ; i<x ; i++){
            if(i*i == x){
                n = i;
                break;
            }

            else if(i*i > x){
                n = i-1;
                break;
            }
        }
        return (int)n;
    }
}