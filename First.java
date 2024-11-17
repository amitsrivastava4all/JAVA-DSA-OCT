class First {
    /*
     * show - function name
     * how function identifiy functionname()
     * 
     * static - keyword , load thing when class is loaded.
     */
    static void show(int num) { // function start
        // for (int i = 1; i <= 5; i++) {
        // System.out.println("Hello Amit");
        // }
        // Termination Case / Base Case
        if (num == 0) {
            return; // exit from the function call, and get back to calling point
        }
        System.out.println("Hello Amit " + num); // Logic
        // num - 1 (Small Problem)
        show(num - 1); // stack build
        System.out.println("Hello Amit " + num);
        // Stack Fall Area
    } // function end

    public static void main(String[] args) {
        show(5); // static thing load with class so it can call directly or with classname
    }
}

/*
 * function - bunch of lines ,
 * put inside some name, whenever u need it just call it
 */