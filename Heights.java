public class Heights {
    public static void main(String[] args) {
        int arr[] = {1, 3, 4, 5, 2, 1, 5};

        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            int left_max = 0;
            int right_max = 0;
            // Check elements to the left of i
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[i]) {
                    left_max = Math.max(left_max, arr[j]);
                    count++;
                }
            }
            // Check elements to the right of i
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    right_max = Math.max(right_max, arr[j]);
                    count++;
                }
            }
            // Print the count for each element
            System.out.println("For element at index "+ i + ": count = " + count);
        }
    }
}