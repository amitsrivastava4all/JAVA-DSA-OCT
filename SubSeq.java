public class SubSeq {

    static void subSeq(String str, String output) {
        if (str.length() == 0) {
            System.out.println(output);
            return;
        }
        String small = str.substring(1);
        // Pick it
        subSeq(small, output + str.charAt(0));
        // Not Pick it
        subSeq(small, output);
    }

    public static void main(String[] args) {
        subSeq("amit", "");
    }
}
