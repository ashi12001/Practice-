import java.util.Scanner;

public class _4Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int i = 0;
        int sum =0;

        while(i<=number){
            sum+=i;
            i++;
        }
        System.out.println(sum);
        sc.close();
    }
    
}
