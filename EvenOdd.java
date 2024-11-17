public class EvenOdd {
    static int[] evenOdd(int n) {
        // base case
        if (n == 0) {
            int arr[] = { 0, 0 };
            return arr;
            // int arr[] = {0,0};
            // arr[0] = even count
            // arr[1] = odd count
        }

        int a[] = evenOdd(n - 1); // small problem
        if (n % 2 == 0) {
            a[0] = a[0] + 1;
        } else {
            a[1] = a[1] + 1;
        }
        return a;
    }

    static void evenOdd(int n, int even, int odd) {
        // Base case
        if (n == 0) {
            System.out.println("Even Count " + even);
            System.out.println("Odd Count " + odd);
            return; // exit from the current function call
        }
        // Small Problem
        if (n % 2 == 0) {
            even++;
        } else {
            odd++;
        }
        evenOdd(n - 1, even, odd);
    }

    public static void main(String[] args) {
        // 1 to N - Count Even and Odd (Big Problem)
        // evenOdd(100, 0, 0);
        int arr[] = evenOdd(100);
        System.out.println("Even Count " + arr[0]);
        System.out.println("Odd Count " + arr[1]);
    }
}
