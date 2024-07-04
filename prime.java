public class prime {
    public static boolean primeno(int N) {
        int count = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                count++;
                if ((N % i) != i) {
                    count++;
                }
            }

        }
        if (count == 2)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int N = 4;
        boolean result = primeno(N);
        System.out.println(result);
    }
}
