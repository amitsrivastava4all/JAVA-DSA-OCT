public class Peterson {
    public static void main(String[] args) {
        int num = 100;
        int sum = 0;
        int copy = num;
        while(num!=0){
        // get the single digit
        int lastDigit = num % 10;
        // compute the factorial of lastDigit
        
        int factorial = 1;
        while(lastDigit>=1){
            factorial = factorial * lastDigit;
        lastDigit--;
        }
        sum = sum + factorial;
        num = num / 10;
    }
    System.out.println(copy == sum?"Peterson Number":"Not Peterson Number");
        /*
         * Extract the digit one by one - % 10
         * do the factorial of a digit - N to 1 Loop
         * Sum of the factorial
         * at the end  then compare the sum with org number, 
         * if both same Peterson , otherwise not
         */

    }
}
