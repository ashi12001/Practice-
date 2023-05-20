public class _11Floyd {
    public static void main(String[] args) {
        int num =0;
        int n=5;

        for(int i =1;i<=n;i++){

            for(int j=1; j<=i;j++){
                num++;
                System.out.print(num+" ");
            }
            System.out.println();
            
        }
    }
}
