public class _Q2 {
    public static void main(String[] args) {
        

        // Write a program thatr  eads a setofintegers,andthen printsthesumoftheeven and odd integers


        int n=100;
        int sumEven =0;
        int sumOdd =0;

        for (int i = 1; i <= n; i++) {
            if (i%2==0) {
                sumEven =sumEven+i;
                
            }
            else{
                sumOdd =sumOdd+i;
            }

            
        }
        System.out.println(sumEven);
        System.out.println(sumOdd);


    }
    
}
