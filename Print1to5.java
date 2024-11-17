public class Print1to5 {
    static void show(int num) {
        if (num > 5) {
            return; // exit from the function call
        }
        System.out.println(num);
        show(num + 1);
    }

    public static void main(String[] args) {
        show(1);
    }

}
