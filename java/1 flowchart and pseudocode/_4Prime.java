import java.util.Scanner;

public class _4Prime  {
                                        
       public static void main(String[] args) {
        Scanner object  = new Scanner(System.in);
        
        System.out.println("Enter number"); //input
        int n = object.nextInt();
        object.close();
        

        int div =2;

        while ( div<n ) {    //process and decison
            if(n%div==0){
                System.out.println("Not prime");
                return; //exit
                

            }
            div =div +1;
            

            
        }
        System.out.println("prime");
        
       
                                        
  }
}