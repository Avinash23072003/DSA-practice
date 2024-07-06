import java.util.*;

public class Factorial {

    // Approach 1 TC=O(log(N))
    public static int fact1(int N) {
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            if (fact * i <= N) {
                fact = i;
            }
            ;
        }
        return fact;

    }

    public static int fact2(int N) {
        if (N == 0) {
            return 1;
        }
        return N * fact2(N - 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(fact1(N));
        System.out.print(fact2(N));
    }
}
