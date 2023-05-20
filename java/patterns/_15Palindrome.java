public class _15Palindrome {
    public static void main(String[] args) {
        int n =5;
        for(int i=1;i<=n;i++){
            //for space
            for(int j =1; j<=n-i;j++){

                System.out.print(" ");
            }

            //for *
            int num =i;

            for(int k=1;k<=2*i-1;k++){

                
                System.out.print(num);

                if(k>=i){
                    num++;

                }
                else{
                    num--;
                }

            
            }
            System.out.println();

        }
    }
}
