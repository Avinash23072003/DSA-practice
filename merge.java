public class merge {
    static void merge_array(int arr[], int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        int temp[] = new int[high - low + 1];
        int k = 0;
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp[k] = arr[left];
                left++;
            } else {
                temp[k] = arr[right];
                right++;
            }
            k++;
        }
        while (left <= mid) {
            temp[k] = arr[left];
            left++;
            k++;
        }
        while (right <= high) {
            temp[k] = arr[right];
            right++;
            k++;
        }
        for (int i = 0; i < temp.length; i++) {
            arr[low + i] = temp[i];
        }
    }

    public static void ms(int arr[], int low, int high) {
        if (low >= high) {
            return;
        }
        int mid = (low + high) / 2;

        // Sort first and second halves
        ms(arr, low, mid);
        ms(arr, mid + 1, high);

        // Merge the sorted halves
        merge_array(arr, low, mid, high);

    }

    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = { 1, 45, 3, 2, 11, 2, 1 };
        int n = 7;
        ms(arr, 0, n - 1);
        printArray(arr);
    }
}