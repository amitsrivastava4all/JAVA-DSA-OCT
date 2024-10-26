public class GreaterInFour {
    public static void main(String[] args) {
        int a = 10;
        int b= 20;
        int c= 30;
        int d = 40;
        // with out && 
        if(a>b){
            if(a>c){
                if(a>d){
                    System.out.println("A is Greater");
                }
                else{
                    System.out.println("D is Greater");
                }
            }
            else{
                if(c>d){
                    System.out.println("C is Greater");
                }
                else{
                    System.out.println("D is Greater");
                }
            }
        }
        else{
            if(b>c){
                if(b>d){
                    System.out.println("B is Greater");
                }
                else{
                    System.out.println("D is Greater");
                }
            }
            else{
                if(c>d){
                    System.out.println("C is Greater");
                }
                else{
                    System.out.println("D is Greater");
                }
            }
        }
    }
}
