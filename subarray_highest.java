public class subarray_highest {
    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,2,3,6};
        int k =3;
        for(int i=0;i<=arr.length-k;i++){
            int max = arr[i];
            for(int j = i;j<=i+k-1;j++){
                max = Math.max(max, arr[j]);
            }
            System.out.println(max);
        }
    }
}
