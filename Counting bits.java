// Leetcode - 338
// Counting Bits
// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

// Explanation:
// Here i/2 gives a value that value is automatically converted into bits. after i%2 gives a remainder.
// That remainder is add the bits convert number.
// I attached the things to amke more clear with the helpful chatGpt
// i	Binary	res[i]
// 0	0000	0
// 1	0001	1
// 2	0010	1
// 5	0101	res[2] + 1 = 1 + 1 = 2
// 10	1010	res[5] + 0 = 2 + 0 = 2

// Time comlexity : O(n)


// Code
class Solution {
    public int[] countBits(int n) {
       int[] res = new int[n+1];
       for(int i=1;i<=n;i++){
        res[i] = res[i/2] +(i%2);       
       }
       return res;
    }
}
