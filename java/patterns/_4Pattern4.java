public class _4Pattern4 {
    public static void main(String[] args) {
        int n=5;
        for(int i =1;i<=n;i++){
            //space is coming i+1 times

            for (int j = 0; j <i; j++) {
                System.out.print(" ");
            }
            //for printing stars
            for(int k =1;k<=n-i+1;k++ ){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
