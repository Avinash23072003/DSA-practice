public class divisors {

    public static void div(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                System.out.println(i);
                sum = sum + i;
                System.out.println(sum);
            }
        }
    }

    public static void main(String[] args) {
        int n = 36;
        div(n);
    }
}
