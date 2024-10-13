public class StringDemo2 {
    /*
     * String Pool - reuse of the same string
     * String - Immutable
     */
    public static void main(String[] args) {
     
        // String msg = "Welcome User";
        // String msg2 = "Welcome User";
        // msg = "Good Bye User";
        // System.out.println(msg);
        // System.out.println(msg2);
        String query = "select * from products";
        double price = 90000;
        if(price>0){
            query = query + " where price > "+price;
        }
        String brand = "samsung";
        if(brand.length()>0){
            query = query + " and brand = "+brand;
        }
    }
}
