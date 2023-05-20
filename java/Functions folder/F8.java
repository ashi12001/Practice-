import java.util.Scanner;

public class F8 {
        public static void primeInRange(int a,int b){
            

            for(int i=a;i<=b;i++){
                

                if(isPrime(i)){
                    System.out.print(i+" ");
                }

            }
        }
        public static boolean isPrime(int n){
            for(int i=2;i<=Math.sqrt(n);i++){
                if(n%i==0){
                    return false;
                }
            }
            
            return true;
        }

                                        
       public static void main(String[] args) {
        //primes in range
        Scanner sc =new Scanner(System.in);

        int inititalRange = sc.nextInt();
        int lastRange = sc.nextInt();
        sc.close();


        primeInRange(inititalRange, lastRange);




                                        
                                        
                                        
  }
}