public class InversionCount {
    
    public static void main(String[] args) {
        int[] arr = {8, 4, 2, 1};
        long output = countInversions(arr);
        System.out.println(output); // Output: 6
    }

    public static long countInversions(int[] arr) {
        if (arr == null || arr.length < 2) return 0;
        // int[] temp = new int[arr.length];
        return mergeSort(arr, 0, arr.length - 1);
        // return mergeSort(arr, temp, 0, arr.length - 1);
    }

    private static long mergeSort(int[] arr, int left, int right) {
    // private static long mergeSort(int[] arr, int[] temp, int left, int right) {
        long count = 0;
        System.err.println("hello");
        if (left < right) {
            int mid = left + (right - left) / 2;

            count += mergeSort(arr, left, mid);
            count += mergeSort(arr, mid + 1, right);
            count += merge(arr, left, mid, right);
            // count += mergeSort(arr, temp, left, mid);
            // count += mergeSort(arr, temp, mid + 1, right);
            // count += merge(arr, temp, left, mid, right);

        }
        return count;
    }

    private static long merge(int[] arr, int left, int mid, int right) {
    // private static long merge(int[] arr, int[] temp, int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        // int k = left;
        long inversions = 0;

        while (i <= mid && j <= right) {
            if (arr[i] <= arr[j]) {
                // k++;
                i++;
                // temp[k++] = arr[i++];
            } else {
                // temp[k++] = arr[j++];
                j++;
                inversions += (mid - i + 1);
            }
        }
        System.err.println("hello");
        // while (i <= mid) temp[k++] = arr[i++];
        // while (j <= right) temp[k++] = arr[j++];

        // for (i = left; i <= right; i++) {
        //     arr[i] = temp[i];
        // }

        return inversions;
    }

    // Test

}
