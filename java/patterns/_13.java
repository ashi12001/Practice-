public class _13 {
    //BUTTERFLY pattern


    public static void main(String[] args) {
        
        for(int i =1;i<=4;i++){
            
            // printing star first

            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            // printing space

            for(int k =1;k<=8-2*i;k++){
                System.out.print(" ");
            }
            // printing last one 
            for(int j =1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();

        }
        // reverse printing
        int n=4;

        for(int i=1 ;i<=n;i++){
            

            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            //for space
            for (int k = 1; k <=2*(i-1);k++) {
                System.out.print(" ");
            }
            for(int j=1;j<=n-i+1;j++){
                System.out.print("*");
            }
            System.out.println();

        }

    }

}
