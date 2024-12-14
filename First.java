class First {
    static void factHelper(int f, int result) {
        // Base case
        if (f == 1) {
            System.out.println(result);
            return;
        }
        // Small Problem
        factHelper(f - 1, result * f);
    }

    // Factorial
    static void fact(int f) {
        factHelper(5, 1);
    }

    public static void main(String[] args) {
        fact(5);
    }
}