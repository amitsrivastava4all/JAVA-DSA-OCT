class Loops{
    public static void main(String[] args) {
        int num =9;
        int factor = 0;
        // for(int i  = 1; i<=num ; i++){
        //     if(num % i ==0){
        //         factor++;
        //     }
        // }
        // System.out.println(factor==2?"Prime Number":"Not Prime Number");
        // for(int i  = 2; i<=num-1 ; i++){
        //     if(num % i ==0){
        //         System.out.println("Not Prime Number");
        //         return ; //exit from the function
        //     }
        // }
        // System.out.println("prime number");
        // for(int i =2; i*i<=num; i++){
            for(int i =2; i<=Math.sqrt(num); i++){
            if(num % i ==0){
                System.out.println("Not Prime Number");
                 return ; //exit from the function 
            }
        }
        System.out.println("Prime Number");
    }
}