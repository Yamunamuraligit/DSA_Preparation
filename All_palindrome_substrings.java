// leetcode -- 647
// Question -- Palindrome Substring
// we are identifying all the substrings palindrome present in the main string

// Method:
// String.length() -- it is a methos of string to identify the length of the string.
// String.charAt(index) -- it will return the character present in the index of the string.

// Time complexity - O(n^2)

// code
class Solution {
    public int countSubstrings(String s) {
        if(s.length() == 0) return 0;
        int n = s.length();
        boolean[][] dp =new boolean[n][n];
        int res =0;
        for(int len = 1;len <= n;len++){
            for(int i=0,j=len+i-1;j<n;i++,j++){
                if(len == 1){
                    dp[i][j]=true;
                    res++;
                }
                else if(len ==2){
                    dp[i][i+1] = s.charAt(i) == s.charAt(i+1);
                    if(dp[i][i+1]) res++;
                }
                else{
                    dp[i][j] = s.charAt(i) == s.charAt(j) && dp[i+1][j-1];
                    if(dp[i][j]) res++;
                }
            }
        }
        return res;
    }
}
