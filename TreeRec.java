public class TreeRec {

    static void rec(int n) {
        if (n <= 0) {
            return;
        }
        System.out.println("Pre " + n);
        rec(n - 1);
        System.out.println("B/W " + n);
        rec(n - 2);
        System.out.println("Post " + n);
    }

    public static void main(String[] args) {
        rec(5);
    }
}
