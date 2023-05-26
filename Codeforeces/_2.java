import java.util.Scanner;

public class _2 {
    // A. Watermelon
    
    public static String weight(int w){
        for (int i = 1; i <w; i++) {
            int b1=i;
            int b2=w-i;

            if(b1%2==0&b2%2==0){
                return "YES";
            }
            
        }

        return "N0";

    }
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        int s = sc.nextInt();
        if(s>=1&&s<=100)
        System.out.println(weight(s));
        sc.close();

        

    }
}
