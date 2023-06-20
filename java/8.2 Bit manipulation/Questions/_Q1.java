import java.util.Scanner;

// My approach is first i XOR both of the numbers and i got value 
//  which have same amount of bits which are diff then i calculated them by for loop and using and operator

public class  _Q1 {
                                        
       public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number1= sc.nextInt();
        int number2= sc.nextInt();

        int ans  = number1^number2;
        int bitmask = 1;

        int count =0;

        for (int i = 0; i < 8; i++) {
            int res = ans & (bitmask<<i);
         
            if(res!=0){
                count+=1;
            }
        }

        System.out.print(count);
        System.out.print(" bits needs to be changed");
        sc.close();
                                        
                                        
                                        
  }
}


// Given two integers, num1 and num2, write a program to find the number of 
// bits that need to be flipped in order to convert num1 to num2.