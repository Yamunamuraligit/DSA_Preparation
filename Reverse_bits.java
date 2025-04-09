// Leetcode -- 190
// Question -- Reverse Bits
// Reverse bits of a given 32 bits unsigned integer.

// Methods:
// String.format() -- it is mainly used to format the string.
// After formating string with certain positions.we are replacing the string empty places with the zeros
// String.format().replace(original_character,replacing_characater) -- replacing the orginal character with the replacing charcter
// StringBuilder(String) -- it makes the string muatble and we are perfrom the operations.
// String.reverse() -- reversing the string
// String().tostring() -- by again converting the stringBuilder into string by using toString() mathod
// parseLong(String,radix) -- It is a method that converts a string into a number based on the radix.Radix means the base like the biary number as 2 , decimal number as 10...

// Time complexity -O(1)

// Code
public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        String binary = String.format("%32s",Integer.toBinaryString(n)).replace(' ','0');
        String reversed = new StringBuilder(binary).reverse().toString();
        return (int) Long.parseLong(reversed,2);

    }
}
