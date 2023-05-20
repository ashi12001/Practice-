public class _3RIght {
    public static void main(String[] args) {
        int n =5;
// Giving Gap is easy just two loops 


        for(int i =1; i<=n;i++){

            for(int j =1;j<=n-i;j++){
                System.out.print(" ");
            }
            
            for(int k =1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}

