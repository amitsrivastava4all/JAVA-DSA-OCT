public class SumOfDigit {
    static void sumOfDigit(int num, int sum) {
        // Base case
        if (num == 0) {
            System.out.println(sum);
            return;
        }
        sumOfDigit(num / 10, sum + num % 10);
    }

    static int sumOfDigit(int num) {
        // base case
        if (num == 0) {
            return 0; // sum initalize 0
        }
        return sumOfDigit(num / 10) + num % 10;
        // int sum = sumOfDigit(num / 10);
        // return sum + num % 10;
    }

    public static void main(String[] args) {
        // sumOfDigit(123, 0);
        System.out.println(sumOfDigit(1234));
        // num = 123
        // sum 1 + 2 + 3 = 6
        // Hint % / +
        // 1. Small Problem
        // 2. Processing Logic
        // 3. Base Case
    }
}
