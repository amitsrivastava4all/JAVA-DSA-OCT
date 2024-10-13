public class Add {
   // Command Line Arguments 
   public static void main(String[] args) {
      // System.out.println(args[0]);
      // System.out.println(args[1]);
      int sum = 0;
      for(int i = 0; i<args.length; i++){
         sum = sum + Integer.parseInt(args[i]);
      }
      System.out.println(sum);
   } 
}
