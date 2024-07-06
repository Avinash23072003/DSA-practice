public class stringpalindrome {
    public static boolean stringp(int i, String s) {
        if (i >= s.length() / 2)
            return true;

        if (s.charAt(i) != s.charAt(s.length() - i - 1))
            return false;

        return stringp(i + 1, s);

    }

    public static void main(String[] args) {
        String s = "MADAM";
        System.out.println(stringp(0, s));
    }
}
