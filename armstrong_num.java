public class armstrong_num {
    public static boolean armstrong(int num) {
        int dup = num;
        int sum = 0;
        while (num > 0) {
            int ld = num % 10;
            sum = sum + ld * ld * ld;
            num = num / 10;
        }
        if (sum == dup) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        int num = 153;
        boolean result = armstrong(num);
        System.out.println(result);
    }
}
