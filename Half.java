public class Half {

    static void halfPrint() {
        for (int i = 2; i <= 8; i += 2) {
            for (int j = 1; j <= i / 2; j++) {
                System.out.print("1");
            }
            for (int j = 1; j <= i / 2; j++) {
                System.out.print("2");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        halfPrint();
    }
}
