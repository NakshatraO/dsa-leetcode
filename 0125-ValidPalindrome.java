/*
Problem: 125. Valid Palindrome

Time Complexity: O(n)
Space Complexity: O(1)
*/

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();

        int left = 0;
        int right = str.length() - 1;

        while(left < right){
            if(!((str.charAt(left)>='A' && str.charAt(left)<='Z') || (str.charAt(left)>='a' && str.charAt(left)<='z') || (str.charAt(left)>='0' && str.charAt(left)<='9')))
                left++;

            else if(!((str.charAt(right)>='A' && str.charAt(right)<='Z') || (str.charAt(right)>='a' && str.charAt(right)<='z') || (str.charAt(right)>='0' && str.charAt(right)<='9')))
                right--;
                
            else{
                if(str.charAt(left) != str.charAt(right))
                return false;
                left++;
                right--;
            }
            
        }
        return true;
    }
}