import java.util.Scanner;

public class _Q3 {

    public static int countsetbits(int n){
        int bitmask = 1;
        int count = 0;

        for (int i = 0; i < 7; i++) {
            int result = n&(bitmask<<i);
            if(result!=0){
                count++;
            }
        }


        return count;
       
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(countsetbits(n));
        sc.close();
        
        
    }
}

// Write a program to count the number of set bits (bits with a value of 1) in a given integer.
//  Design a function that takes an integer num as input and returns the count of set bits.