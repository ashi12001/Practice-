
/* 
write a program in C to print the Fibonacci Series using recursion. Go to the editor
Test Data : 
Input number of terms for the Series (< 20) : 10
Expected Output:

 Input number of terms for the Series (< 20) : 10                                
 The Series are :                                                                
 1  1  2  3  5  8  13  21  34  55
 */


public class _4Fibonacci {
    public static int fibo(int n){
        if(n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }

        return fibo(n-1)+ fibo(n-2);


    }
    public static void printfibo(int n) {
        for (int i = 0; i <=n; i++) {
            System.out.print(fibo(i)+" ");
        }
        
    }
    public static void main(String[] args) {
        System.out.println(fibo(66));
        printfibo(29);
    }
}
