public class RefDemo {
    public static void main(String[] args) {
        // Immutable - Can't change the original
        // change happens in copy
        int a= 10;
        int b = a;
        b = b + 10;
        System.out.println(a);
        System.out.println(b);
        // Mutable
        StringBuffer sb = new StringBuffer("Hello");
        StringBuffer sb2 = sb;
        sb2.append("Hi Java");
        System.out.println(sb);
        System.out.println(sb2);

    }
}
