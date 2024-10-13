public class Three {
    /*
     * can we have more than one main method in a single java class
     */
    public static void main(int x){
        System.out.println("int Main...");
    }
    public static void main(double x){
        System.out.println("double Main...");
    }
    public static void main(String x){
        System.out.println("String Main...");
    }
    public static void main(String[] args) {
        main(10);
        main(90.20);
        main("Hello");
        System.out.println("Main...");
    }
}
