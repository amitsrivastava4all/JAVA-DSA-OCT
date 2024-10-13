public class StringBufferDemo {
    public static void main(String[] args) {
       StringBuilder sb = new StringBuilder();
        //StringBuffer sb = new StringBuffer();
        sb.append("select * from products");
        //StringBuffer sb = new StringBuffer("select * from products");
        System.out.println(sb.length());
        System.out.println(sb.capacity()); // len + 16 (default cap)
        sb.append(" where price>9000 and brand='puma' and quantity>100000 and location='India'");
        sb.ensureCapacity(200);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        sb.append("and unit = 2");
        System.out.println(sb.length());
        System.out.println(sb.capacity());
        // new cap = old cap * 2 + 2
        // len > new cap
        // new cap = len

    }
}
