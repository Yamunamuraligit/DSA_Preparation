// Leetcode -- 190
// Question -- Reverse Bits
// Reverse bits of a given 32 bits unsigned integer.
// Methods:
// 





// Code
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binary = String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String reversed = new StringBuilder(binary).reverse().toString();
        return (int) Long.parseLong(reversed,2);

    }
}
