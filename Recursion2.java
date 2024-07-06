import java.util.Scanner;

public class Recursion2 {
    // public static void recc_fun(int i, int N) {
    // if (i > N) {
    // return;
    // }

    // System.out.print(i + " ");
    // recc_fun(i + 1, N);
    // }

    /*
     * 
     * public static void ress3(int N) {
     * if (N < 1) {
     * return;
     * }
     * System.out.print(N + " ");
     * ress3(N - 1);
     * }
     */

    /*
     * public static void sum(int i, int sum) {
     * if (i < 1) {
     * System.out.print(sum);
     * return;
     * }
     * sum(i - 1, sum + i);
     * 
     * }
     * /*
     */

    public static int fun1(int N) {
        if (N == 0) {
            return 0;
        }
        return N + fun1(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fun1(N));

        // int sum = 0;

        // recc_fun(1, N);
        // ress3(N);
        // sum(N, sum);

    }
}
