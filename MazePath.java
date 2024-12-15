public class MazePath {
    // try - count version
    // static int mazePath(int startRow, int startCol, int endRow, int endCol) {
    // // return total paths
    // }

    static void mazePath(int startRow, int startCol, int endRow, int endCol, String result) {
        // Base case
        if (startRow == endRow && startCol == endCol) {
            System.out.println(result);
            return;
        }
        // Negative Base
        if (startRow > endRow || startCol > endCol) {
            return;
        }
        // Go Right (Col + 1)
        mazePath(startRow, startCol + 1, endRow, endCol, result + "R");
        // Go Down (Row + 1)
        mazePath(startRow + 1, startCol, endRow, endCol, result + "D");
    }

    public static void main(String[] args) {
        mazePath(0, 0, 2, 2, "");
    }
}
