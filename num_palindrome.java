public class num_palindrome {
    public static boolean palindrome(int num) {
        int dup = num;
        int revnum = 0;
        while (num > 0) {
            int lastdigit = num % 10;
            revnum = (revnum * 10) + lastdigit;

            num = num / 10;
        }
        return revnum == dup;

    }

    public static void main(String args[]) {
        int num = 1919;
        boolean result = palindrome(num);
        System.out.println(result);
    }

}
