import java.util.Scanner;

public class _5Multiply {
                                        
       public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c =a*b;
        System.out.println(c);

        System.out.println();
        System.out.println("Enter radius");
        double r =sc.nextFloat();
        double area = 3.14*r*r;
        System.out.println(area);
        sc.close();
        
                                        
                                        
                                        
  }
}