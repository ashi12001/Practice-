import java.util.Scanner;

public class _2SimpleInterest {
                                        
       public static void main(String[] args) {
        Scanner object = new Scanner(System.in);  //start
        
        int principal = object.nextInt();   //input
        int Rate = object.nextInt();
        int Amount = object.nextInt();

        int simpleInterest = (principal*Amount*Rate)/100; //process

        System.out.println("simple interest is " + simpleInterest); //output

        object.close(); //exit



                                        
                                        
                                        
  }
}