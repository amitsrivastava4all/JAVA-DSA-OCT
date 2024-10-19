import java.math.BigDecimal;
import java.math.BigInteger;

public class BigTypes {
    public static void main(String[] args) {
        BigInteger b = new BigInteger("10000000000000000");
        BigInteger b2 = new BigInteger("546457577546456464565654645645645645");
        BigInteger b3 = b.add( b2);
        System.out.println(b3);
        BigDecimal c = new BigDecimal("5346464564645456456.432434");
        BigDecimal c2 = new BigDecimal("6456546546456464564645.77");
        BigDecimal c3 = c.add(c2);
        System.out.println(c3);
       // long b3 = 546457577546456464565654645645645645;
    }
}
