public class Fibo {

    static int fibo(int n) {
        if (n <= 1) {
            return n;
        }
        int second = fibo(n - 1); // 2nd Term
        int first = fibo(n - 2); // first term
        return first + second;
    }

    public static void main(String[] args) {
        System.out.println(fibo(145));
    }
}
