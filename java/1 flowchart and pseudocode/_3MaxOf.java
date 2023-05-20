import java.util.Scanner;

public class _3MaxOf  {
                                        
       public static void main(String[] args) {
        Scanner object =new Scanner(System.in);

        System.out.println("Enter three numbers");;
        int a = object.nextInt();
        int b = object.nextInt();     //input
        int c = object.nextInt();

        if (a>b) {
            if (a>c) {
                System.out.println("maximum is"+ a);
                
            }
            else{
                System.out.println("MAxim" + c);
            }
            
        }
        else{
            if (b>c) {
                System.out.println("maximum is"+ b);
            }
            else{
            
                System.out.println("maximum is"+  c);
            }
        }

object.close();



                                        
                                        
                                        
  }
}