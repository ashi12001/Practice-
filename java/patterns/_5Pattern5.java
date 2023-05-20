public class _5Pattern5 {
    public static void main(String[] args) {
        int n=5;

        for(int i=1;i<=n;i++){

            // For spaces  starts
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }

       //for apna star

            for(int k=1;k<=2*i-1;k++){
                System.out.print("*");
            }
            System.out.println();
            

        }
    }
    
}
