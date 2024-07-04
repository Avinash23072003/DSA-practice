import java.util.Scanner;

public class Recursion2 {
    public static void recc_fun(int i, int N) {
        if (i > N) {
            return;
        }

        System.out.print(i + " ");
        recc_fun(i + 1, N);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        recc_fun(1, N);

    }
}
