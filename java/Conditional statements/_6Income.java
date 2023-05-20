import java.util.Scanner;

public class _6Income {
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("ROughly how many lakhs you earn");
        int income = sc.nextInt();
        int x =100000;
        income*=x;

        int tax =1;
        System.out.print("Your tax is");

        if(income<=5*x){
            tax= income*10/100;
        }
        else if (income>5*x && income<=10*x){
            tax= income*20/100;
        
        }
        else{
            tax= income*30/100;
        }
        income  =income+tax;
        System.out.println("your taxated income is "+ income);
        sc.close();
    }
}
