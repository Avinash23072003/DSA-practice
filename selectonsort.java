import java.util.Scanner;

public class selectonsort {
    // public static void sort(int arr[], int N) {
    // for (int i = 0; i <= N - 2; i++) {
    // int min = i;
    // for (int j = i; j <= N - 1; j++) {
    // if (arr[j] < arr[min]) {
    // min = j;
    // }
    // }
    // int temp = arr[min];
    // arr[min] = arr[i];
    // arr[i] = temp;

    // }

    // }
    public static void bubble_sort(int arr[], int N) {
        for (int i = 0; i <= N - 1; i++) {
            for (int j = 0; j <= N - 2; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    // public static void printarray(int arr[], int N) {
    // for (int i = 0; i < N; i++) {
    // System.out.print(arr[i] + " ");
    // }
    // }
    public static void insertion_sort(int arr[], int N) {
        for (int i = 0; i <= N - 1; i++) {
            int j = i;
            while (j > 0 && arr[j - 1] > arr[j]) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
                j--;

            }

        }
        ;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int arr[] = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();

        }
        // sort(arr, N);
        // bubble_sort(arr, N);
        insertion_sort(arr, N);
        for (int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}