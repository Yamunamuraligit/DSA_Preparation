
class longest_subarray {
    public static void main(String args[]) {
        String str = "pwwekw";
        boolean[] arr = new boolean[256];
        int length = 0;
        for (int i = 0; i < str.length(); i++) {
            for (int j = i; j < str.length(); j++) {
                if (arr[str.charAt(j)]) {
                    break;
                }
                arr[str.charAt(j)] = true;
                length = Math.max(length, j - i + 1);
            }
            for (int k = i; k < str.length(); k++) {
                arr[str.charAt(k)] = false;
            }
        }
        System.out.println(length);
    }
}