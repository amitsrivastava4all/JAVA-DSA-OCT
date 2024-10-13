// class name and file name same?
// Yes and No
// Yes - when class is public, then class name and file name must be same.
// No - when class is not public, then class name and file name can be different

// class name rules (Identifier) - 
// 1. class name AlphaNumeric 
// 2. no keyword in class name
// 3. class name not contain space, only two special characters u can use in class name
// 4. PascalCase
// _ and $
// class _A{} 
// class A{
//     class B{

//     }
// }

// class - access modifier use
// 1. public - access outside the package (Folder)
// 2. default - access inside the package 
class SavingAccount{
 // class members can be private , public , protected, default
 int x; // default
 private int y; // with in the class
 public int z; // access outside the package
 protected int n ; // access inside the package and outside only using inheritance
}
// A$B
 class MyThree {
    // static - things will be loaded when class is load
    //  static things bind with class
    // ClassName.staticThing
    public static void main(String[] args) {
        System.out.println("Hello World");
        // println() synchronized - method - internally call print and newline methods
        // println - method overloading
        // out - out is an object of PrintStream class
        // System - predefine class
        // in (InputStream) , out , err (PrintStream)

    }
}
