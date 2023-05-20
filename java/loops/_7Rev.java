public class _7Rev  {
                                        
       public static void main(String[] args) {

        // TO get last digit  of a n    n%10;
        // to remove last digit   n/10;
        //  And  finally n will be zero

        //  2%10 == 2    and    2/10 ==0

        int n =56783;

        while(n>0){

            int last = n%10;
            System.out.print(last+" ");

            n /=10;
        }

        //storing last in a var
        int rev =0; 

        while(n>0){

            int last = n%10;
            rev = rev*10 +last;

            n /=10;
        }
                                        
                                        
                                        
  }
}