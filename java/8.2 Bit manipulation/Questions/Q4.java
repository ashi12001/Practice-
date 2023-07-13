public class Q4 {
                                        
       public static int clearlast_ibits(int n,int lastBits) {
        int bitmask =1;
                for (int i = 0; i < lastBits; i++) {
                    int res = n ^(bitmask<<i);
                    n=res;
                }
                return n;
        
       }
       public static void main(String[] args) {


        System.out.println(clearlast_ibits(15, 3));
                                        
                                        
                                        
  }
}