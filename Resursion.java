public class Resursion {
    public static void rec(int count) {
        if (count == 4)
            return; // Base condition
        System.out.println(count);
        count++;
        rec(count);

    }

    public static void main(String[] args) {
        rec(0);
    }

}
