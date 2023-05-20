import java.util.Scanner;

public class _3 {
    //Logic agar w even hua toh 2 minus karo fir bhi even rahega mera bruteforce method me test case paas nahi ho raha
        public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int s = sc.nextInt();
        

        if(s>2&&s%2==0){
            int m =s-2;
            if(m%2==0){
                System.out.println("YES");

            }
            else{
                System.out.println("hello");
            }
            
            
        }
        else{
            System.out.println("NO");
        }
        sc.close();
    }
}
