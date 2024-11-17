// Armstrong in Recursive Way
public class ArmStrong {
    // 1. Digit Count
    // 2. Power
    // 3. Comparsion Org Number , Sum Number
    static boolean armStrongNumber(int num) {
        int count = countDigit(num);
        return armStrongNumberHelper(num, count, 0, num);
    }

    static boolean armStrongNumberHelper(int num, int count, int sum, int aux) {
        if (num == 0) {
            if (aux == sum) {
                return true;
            }
            return false;
        }
        int digit = num % 10;
        sum = sum + power(digit, count);
        return armStrongNumberHelper(num / 10, count, sum, aux);
    }

    static int power(int num, int pow) {
        if (pow == 0) {
            return 1;
        }
        int result = power(num, pow - 1);
        return result * num;
    }

    static int countDigit(int num) {
        if (num == 0) {
            return 0;
        }
        int count = countDigit(num / 10);
        return count + 1;
    }

    public static void main(String[] args) {
        System.out.println(armStrongNumber(10000) ? "ArmStrong Number" : "Not Armstrong Number");
        // System.out.println(countDigit(153));
        // System.out.println(power(3, 3));
        // int num = 153;
        // Digit Count - 3
        // 1 ^ 3 + 5 ^ 3 + 3 ^ 3
        // 1 + 125 + 27 = 153
    }
}
