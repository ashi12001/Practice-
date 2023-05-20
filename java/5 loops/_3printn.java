import java.util.Scanner;

public class _3printn {
    public static void main(String[] args) {
        //print till n number

        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int i =1;

        while(i<=n){
            System.out.println(i);
            i++;
        }
        sc.close();

    }
    
}
