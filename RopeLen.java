public class RopeLen {
    // print the ropeLen path
    // static int ropeLen(int rope, int a, int b, int c, String result) {
    // }

    static int ropeLen(int rope, int a, int b, int c) {
        if (rope == 0) {
            return 0;
        }
        if (rope < 0) {
            return -1;
        }
        int optionA = ropeLen(rope - a, a, b, c);
        int optionB = ropeLen(rope - b, a, b, c);
        int optionC = ropeLen(rope - c, a, b, c);
        int result = Math.max(Math.max(optionA, optionB), optionC);
        if (result == -1) {
            return -1;
        }

        return result + 1;

    }

    public static void main(String[] args) {
        System.out.println(ropeLen(23, 10, 11, 12));
    }
}
