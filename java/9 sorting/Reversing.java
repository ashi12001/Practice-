import java.util.Scanner;

class Reversing {
    public static int reverse(int x) {
        long rev = 0;

        if (x > 0) {
            while (x > 0) {
                long num = x % 10;
                rev = rev * 10 + num;
                x = x / 10;
            }
        } else {
            while (x < 0) {
                long num = x % 10;
                rev = rev * 10 + num;
                x = x / 10;
            }
        }

        if ((rev < Math.pow(2, 31)) && (rev > Math.pow(-2, 31))) {
            return (int)rev;
        } else {
            return 0;
        }

        

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.nextLine();
        while (ch != "n") {

            System.out.println("Enter number you want to reverse");
            int x = sc.nextInt();
            int a = reverse(x);
            System.out.println(a);

        }
        sc.close();

    }
}