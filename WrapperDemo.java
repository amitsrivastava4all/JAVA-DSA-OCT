import java.util.ArrayList;
import java.util.LinkedList;
// class Node{
//     Song data;
//     Node next;
// }
// class Song{
//     String name;
//     int duration;
//     int views;
//     String artistName;
//     String photo;
// }
public class WrapperDemo {
    public static void main(String[] args) {
        int g2 = 1000;
        Integer g1 = g2;  // AutoBoxing
        int g3 = ++g1; // AutoBoxing
        // Java DS
        LinkedList<Integer> li = new LinkedList<>();
        ArrayList<Double> al = new ArrayList<>();
        int x = 10; // int literal
        Integer y = x; // Integer Literal (Boxing)
        float t = 100.20f;
        Float t2 = 90.20f;
        char r = 'A';
        Character t3 = 'A';
        System.out.println(Character.isAlphabetic(r));
        System.out.println(Character.isDigit(r));
        int n = t2.intValue(); // UnBoxing
        String r2 = y.toString();
        //Integer z = 100;
        //Integer z= new Integer(100);

    }
}
