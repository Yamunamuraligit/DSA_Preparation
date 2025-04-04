// Better Approach
// class Longest_subarray_repeating_characters {
//     public static void main(String[] args) {
//         String str = "AABABBA";
//         int k = 2;
//         int l = 0, r = 0;
//         int max_freq = 0, max_leng = 0;
//         int[] arr = new int[25];
//         while (r < str.length()) {
//             arr[str.charAt(r) - 'A']++;
//             max_freq = Math.max(max_freq, arr[str.charAt(r) - 'A']);
//             while ((r - l + 1) - max_freq > k) {
//                 arr[str.charAt(l) - 'A']--;
//                 max_freq = 0;
//                 for (int i = 0; i < 25; i++) {
//                     max_freq = Math.max(max_freq, arr[i]);
//                 }
//                 l++;
//             }
//             if ((r - l + 1) - max_freq <= k) {
//                 max_leng = Math.max(max_leng, (r - l + 1));
//             }
//             r++;
//         }
//         System.out.println(max_leng);
//     }
// }

// Optimal Approach
class Longest_subarray_repeating_characters {
    public static void main(String[] args) {
        String str = "AABABBA";
        int k = 2;
        int l = 0, r = 0;
        int max_freq = 0, max_leng = 0;
        int[] arr = new int[25];
        while (r < str.length()) {
            arr[str.charAt(r) - 'A']++;
            max_freq = Math.max(max_freq, arr[str.charAt(r) - 'A']);
            if ((r - l + 1) - max_freq > k) {
                arr[str.charAt(l) - 'A']--;
                l++;
            }
            if ((r - l + 1) - max_freq <= k) {
                max_leng = Math.max(max_leng, (r - l + 1));
            }
            r++;
        }
        System.out.println(max_leng);
    }
}

// Time Complexity -O(n)
// Space Complexity - O(26)
