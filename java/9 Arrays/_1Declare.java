import java.util.Scanner;

public class  _1Declare{
                                        
       public static void main(String[] args) {

        int array[]= new int[5];
        String food []= {"apple","banane","guava ","strawberry"};

        //here i have learned taking inputs and declaration of array

        Scanner sc = new Scanner (System.in);

        array[0]= 100;
        array[1]=200;

        System.out.println(array[0]+array[1]);

        for(int i=0;i<5;i++){
            array[i]=sc.nextInt();
            
        }

        for (String string : food) {
            System.out.print(string+" ");
            
        }

        System.out.println();


        for (int string : array) {
            System.out.print(string+" ");
        }
        
          sc.close();                              
                                        
                                        
  }
}