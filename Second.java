public class Second {
    static int fact(int n) {
        // base case
        if (n == 1) {
            return n;
        }

        // small problem
        int small = fact(n - 1);
        return small * n;
    }

    public static void main(String[] args) {
        int r = fact(5);
        System.out.println(r);
    }
}
