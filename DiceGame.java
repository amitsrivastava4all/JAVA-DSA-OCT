public class DiceGame {

    // Count the possiblities
    // static int diceGame(int start, int end) {
    // }
    static void diceGame(int start, int end, String result) {
        // Base case
        if (start == end) {
            System.out.print(result + " , ");
            return;
        }
        if (start > end) {
            return;
        }
        // diceGame(start+1, end, result+"1");
        // diceGame(start+2, end, result+"2");
        // diceGame(start+3, end, result);
        // diceGame(start+4, end, result);
        // diceGame(start+5, end, result);
        // diceGame(start+6, end, result);
        for (int dice = 1; dice <= 6; dice++) {
            diceGame(start + dice, end, result + dice);
        }
    }

    public static void main(String[] args) {
        diceGame(0, 10, "");
    }
}
