// Leetcode - 5
// Question :- Longest Substring Palindrome
// Palindrome :- when you reverse any words, if you get the same word then it is called palidrome

// Methods:
// String.length() - To return the length of the string.
// String.charAt(Index) -- it will return the charcter in the index of the string.
// String.substring(Startindex,Endindex) -- it will return the substring of the main string with startindex and endindex.

// Timecomplexity - O(n^2)

// Code:

class Longest_substring {
    public static void main(String args[]) {
        String s = "ababad";
        int start = 0;
        int maxLength = 1;
        for (int i = 1; i < s.length(); i++) {
            // odd length
            int l = i - 1;
            int r = i + 1;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLength) {
                    maxLength = r - l + 1;
                    start = l;
                }
                l -= 1;
                r += 1;
            }
            // even length
            l = i - 1;
            r = i;
            while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
                if (r - l + 1 > maxLength) {
                    maxLength = r - l + 1;
                    start = l;
                }
                l -= 1;
                r += 1;
            }
        }
        System.out.println(s.substring(start, start + maxLength));
    }
}
