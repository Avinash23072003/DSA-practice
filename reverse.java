public class reverse {
    public static int reverse_num(int x) {
        int revnum = 0;
        while (x > 0 || x < 0) {
            int lastdigit = x % 10;
            revnum = (revnum * 10) + lastdigit;
            x = x / 10;
        }
        return revnum;
    }

    public static void main(String[] args) {
        int x = -24000;
        int ans = reverse_num(x);
        System.out.println(ans); // Output should be 34432
    }
}
