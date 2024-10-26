// class Employee{
//     int id;
//     String name;
//     double salary;
// }
class IfElse{
    // static - Keyword
    // static things will be load when is loaded
    // object (Real World Entity) = state + Methods
    // Class = Blue Print / Template
    public static void main(String[] args) {
        // Employee amit = new Employee();
        // Employee ram = new Employee();
        int a = 110;
        int b = 120;
        int c = 30;
        // Nested if else
        // Don't use logical and (&&)
        if(a>b) {
            if(a>c){
                System.out.println("A is Greater");
            }
            else{
                System.out.println("C is Greater");
            }
        }  
        else {
            if(b>c){
              System.out.println("B is Greater");  
            }
            else{
               System.out.println("C is Greater"); 
            }
        } 
        // if(a>b && a>c){
        //     System.out.println("A is Greater");
        // }
        // else if(b>a && b>c){
        //     System.out.println("B is Greater");
        // }
        // else{
        //     System.out.println("C is Greater");
        // }
    }
}