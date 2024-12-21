
// Java - Class
// Object Oriented 
public class ReverseString {

    static String reverseString(String str) {
        // Base case (Recursion Stop)
        if (str.length() == 0) {
            return "";
        }
        String smallString = str.substring(1);
        String smallOutput = reverseString(smallString);
        char firstChar = str.charAt(0);
        return smallOutput + firstChar;
    }

    static void reverseString(char arr[], int start, int end) {
        if (start > end) {
            System.out.println(new String(arr));
            return;
        }
        // swap logic
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
        reverseString(arr, start + 1, end - 1);
    }

    static boolean palindrome(char arr[], int start, int end) {
        if (start > end) {
            return true;
        }
        // Base case (Negative Base case)
        if (arr[start] != arr[end]) {
            return false;
        }
        return palindrome(arr, start + 1, end - 1);
    }

    // main - Entry Point
    public static void main(String[] args) {
        // String t = reverseString("amit");
        // System.out.println(t);
        String s = "nitin";
        // reverseString(s.toCharArray(), 0, s.length() - 1);
        System.out.println(
                palindrome(s.toCharArray(), 0, s.length() - 1) ? "Palindrome String" : "Not Palindrome String");
    }
}

/*
 * 
 * // File file = new File("");
 * // Object o ;
 * // o.hashCode()
 * // if(file.exists()){
 * 
 * // }
 * String s = "Welcome"; // Immutable
 * System.out.println(s.hashCode());
 * 
 * // for(int i = 1; i<=1000000; i++){
 * // String t = "Welcome";
 * // }
 * 
 * // // s[0] = 'Q';
 * // System.out.println(s.charAt(0));
 */