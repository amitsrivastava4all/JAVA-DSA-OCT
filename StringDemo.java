public class StringDemo {
    /*
     * String - It is a predefine class
     * Collection of chars
     * Act as a Data Type
     * String can be use in 2 ways
     * 1. String Literal
     * 2. new Object
     * String behind the scene use String Pool Concept
     */
    public static void main(String[] args) {
        // = Assignment Operator
        // == Comparsion Operator / Equality Operator
       // int a = 10; // int literal
        String name = "Amit"; // String Literal
        String name2 = name;
        //System.out.println(name == name2);
        String name3 = new String("Amit");
       // System.out.println(name3 == name);
        // new - keyword 
        // to allocate memory dynamically
        String a = "Ram".intern(); // check Ram in a pool , it is exist or not
        // if not exist then create Ram in a String Pool.
        // 1 Object
        String b = "Ram"; // 0 Object
        System.out.println(a == b);
        String c = new String("Ram").intern(); // 2 or 1 
        System.out.println(a == c);

    }
}
