
import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        // Take 10 integer inputs from user and store them in an array and print them on screen.

        Scanner sc = new Scanner(System.in);

        int[] age =new int[10];

        for(int i=0;i<10;i++){
            age[i]= sc.nextInt();
        }
        for(int i:age){
            System.out.println(i);
        }
        sc.close();

    }
    
}
