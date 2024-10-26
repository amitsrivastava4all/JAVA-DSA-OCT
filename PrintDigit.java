public class PrintDigit {
    public static void main(String[] args) {
        int num = 123456;
        int copy = num;
        int count = 0;
        // count digits
        while(num!=0){
            // Logic
            num = num / 10; // make the number small
            count++; // count the digit
            }
            
            while(copy!=0){
            int pow =(int) Math.pow(10, count - 1);
            System.out.println(copy / pow);
            copy = copy % pow;
            count --;
            }

    }
}
