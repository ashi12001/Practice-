import java.util.Scanner;

public class _3OddAndEven {
    public static void main(String[] args) {
        int bitMask = 1;
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();

        while (ch != "0") {
            
            int n = sc.nextInt();

            if ((n & bitMask) == 1) {
                System.out.println("odd");
            } else {
                System.out.println("even");
            }
            
        }
sc.close();
    }
}
