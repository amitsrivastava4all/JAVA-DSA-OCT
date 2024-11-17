public class PrintDigitOfNumber {
    static void printDigit(int num) {
        // Base case
        if (num == 0) {
            return;
        }
        // Repeat (Small Problem)
        printDigit(num / 10);
        // Logic
        System.out.println(num % 10);

    }

    public static void main(String[] args) {
        printDigit(12345);
    }
}
