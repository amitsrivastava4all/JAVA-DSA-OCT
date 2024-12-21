public class TreeDemo {

    static void show(int x) {
        if (x <= 0) {
            return;
        }
        System.out.println(x);
        show(x - 1);
        show(x - 2);
        show(x - 3);
    }

    public static void main(String[] args) {
        show(3);
    }
}
