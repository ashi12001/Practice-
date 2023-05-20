public class _6Pattern6 {
    public static void main(String[] args) {
        

        for (int i = 1; i <=5; i++) {


            //for spaces only  0,1,2,3,4 spaces are required
           
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
                
            }
            //logic for printing 9 first
            for(int k=1;k<=9-2*i+1;k++ ){
                System.out.print("*");
            }
            System.out.println();
            
        }

    }
    
}
