public class _10rec {
    // ALl basic recursion ques

    public static void number(int n) {
        if(n>0){
            number(n-1); 
            System.out.print(n+" ");
        }
    }
    
    public static void printnumber(int n) {
            if(n==1){
                System.out.println(1);
                return;
            }
            printnumber(n-1);
            System.out.println(n);
   
    }
    
    public static int factorial(int n) {
        if(n==0){
            return 1;
        }
        return n*factorial(n-1);

        // factorial(0) is 1     5 * FACT(4) = FACT(4)= 4 * FACT(3)
        //         2 * FACT(1);                  FACT(1) = 1*  FACT(0);
    }
    
    public static int sumOfN(int N) {
        if(N==1){
            return 1;
        }
        return N+sumOfN(N-1);
        
    }
    
    
    public static void main(String[] args) {
        number(1);
        System.out.println();
        printnumber(5);
        System.out.println("factorial is "+ factorial(5));
        System.out.println(sumOfN(5));
    }
}
