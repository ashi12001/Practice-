public class _Q3 {
    // Write a program to find the factorialof any number entered by the user.

    public static void main(String[] args) {
        int n =5;
        int fact =1;
        
        for(int i =1;i<=n; i++){
            System.out.print(i);
            System.out.println(". Hello world");

            fact =fact*i;
            

        }
        System.out.println("factorial of a number is "+ fact);
    }
    
}
