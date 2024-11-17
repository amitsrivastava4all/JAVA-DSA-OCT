public class Sum {

    // N Natural Number Sum
    static void doSum(int n, int s) {
        // base case
        if (n == 0) {
            System.out.println(s);
            return;
        }
        doSum(n - 1, s + n); // Small Problem
    }

    static int doSum(int n) {
        if (n == 0) {
            return 0; // sum initial value
        }
        int r = doSum(n - 1);
        return r + n;
    }

    public static void main(String[] args) {
        // doSum(10, 0);
        System.out.println(doSum(5));
    }
}
