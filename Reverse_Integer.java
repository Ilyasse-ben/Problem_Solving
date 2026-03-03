/* Description 
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321 
*/

// My solution
class Solution {
    public int reverse(int x) {
        int reversedX=0;
        int MAX_VALUE = 2147483647; // 2**31 - 1
        int MIN_VALUE = -2147483648; // 2**31 
        while(x!=0) {
            if(reversedX> MAX_VALUE/10 || reversedX<-MIN_VALUE/10)
                return 0;
            reversedX=reversedX*10+x%10;
            x/=10;
        }
        
        return reversedX;
        
    }
}
