import java.util.Scanner;
// approach is just take and operation of number 1 and  bitmask and keep shifting bitmask using for loop and 
// when the value number1& bitmask ==number that means it is a power of 2

public class _Q2 {
    public static void main(String[] args) {

       Scanner sc = new Scanner(System.in);
       int number1 = sc.nextInt();
       int bitmask=1;
       

       for (int i = 0; i < 7; i++) {
            int ans = number1&(bitmask<<i);
            if(ans==number1){
                System.out.println("Power of 2");
            }
        

        
       }
       sc.close();

        
    }
}


// Write a program to determine if a given positive integer is a power of two or not.
//  Design a function that takes an integer num as input and returns True if it is a power of two, and False otherwise.

