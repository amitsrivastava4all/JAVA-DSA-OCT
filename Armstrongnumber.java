public class Armstrongnumber {
    public static void main(String[] args) {
        int num = 9474; // Immutable (Copy)
        int copy = num; 
        int count = 0;
        // Every digit Power ^ Count of Number
        // 1 ^ 3
        // count digit
        while(num!=0){
        num = num /10;
        count++;   
        }
        int sum = 0;
        num = copy;
        while(copy!=0){
            int lastDigit = copy % 10;
            sum = sum + (int)Math.pow(lastDigit, count);
            copy = copy / 10;
        }
        
        System.out.println(num == sum ?"Armstrong number":"Not Armstrong number");

        //System.out.println(count);
    }
}
