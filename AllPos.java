public class AllPos {

    static void printAllPos(char start, char end, String result) {
        if (result.length() == 2) {
            System.out.println(result);
            return;
        }
        for (int i = start; i <= end; i++) {
            char singleChar = (char) i;
            if (singleChar == 'A' || singleChar == 'E' || singleChar == 'I' || singleChar == 'O' || singleChar == 'U') {
                printAllPos((char) i, end, result + (char) i);
            }
        }
    }

    public static void main(String[] args) {
        printAllPos('A', 'Z', "");
    }
}
