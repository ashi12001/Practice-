import java.util.Scanner;

public class _4operations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter number");
        int n =sc.nextInt();
        System.out.println("ENter which bit you want");
        int i = sc.nextInt();
        i = 1<<i;

        int get = n&i;

        System.out.println("i th bit is "+get);

        // if((n&i)==0){
        //     System.out.println(0);

        // }
        // else{
        //     System.out.println(1);
        // }
       
        int set = n|i;
        System.out.println(set);
        sc.close();
    }
}
