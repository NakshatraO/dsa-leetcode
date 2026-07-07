/*
Problem: 125. Valid Palindrome

Time Complexity: O(n)
Space Complexity: O(n)
*/

class Solution {
    public boolean isPalindrome(String s) {
        String str = s.toLowerCase();
        String str2 = "";

        for(int i=0 ; i<str.length() ; i++){
            if(Character.isLetterOrDigit(str.charAt(i)))
                str2 += str.charAt(i); 
        }
        
        String rev = new StringBuilder(str2).reverse().toString();
        return str2.equals(rev);
    }
}