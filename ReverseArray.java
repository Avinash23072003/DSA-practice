import java.util.*;

public class ReverseArray {

    // public static void arr(int arr[], int N) {
    // int p1 = 0, q1 = N - 1;
    // while (p1 < q1) {
    // int temp = arr[p1];
    // arr[p1] = arr[q1];
    // arr[q1] = temp;
    // p1++;
    // q1--;
    // }
    // printarray(arr, N);
    // }

    // public static void printarray(int arr[], int N) {
    // for (int i = 0; i < N; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // int N = sc.nextInt();
    // int arr[] = new int[N];
    // for (int i = 0; i < N; i++) {
    // arr[i] = sc.nextInt();
    // }
    // arr(arr, N);

    // }

    public static void rev_array(int array[], int start, int end) {
        if (start < end) {
            int temp = array[start];
            array[start] = array[end];
            array[end] = temp;
            rev_array(array, start + 1, end - 1);
        }
        printarray(array, start + 1, end - 1);
    }

    public static void printarray(int array[], int start, int end) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 5;
        int array[] = { 12, 43, 90, 42, 54 };
        // for (int i = 0; i < n; i++) {
        // array[i] = sc.nextInt();
        // }

        int start = 0, end = n - 1;
        rev_array(array, start, end);

    }
}