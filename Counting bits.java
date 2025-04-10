// Leetcode - 338
// Counting Bits
// Given an integer n, return an array ans of length n + 1 such that for each i (0 <= i <= n), ans[i] is the number of 1's in the binary representation of i.

// Explanation:


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
