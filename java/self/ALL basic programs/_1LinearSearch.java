public class _1LinearSearch  {
        
       public static boolean findElement(int a,int []A){
            for (int i = 0; i < A.length; i++) {
                if(A[i]==a){
                    return true;
                }
                
                
            }
            return false;

       }
       public static void main(String[] args) {

        int []arr={1,432,23,12,5};

        System.out.println(findElement(23, arr));
                                        
        // best case O(1) and worst case o(n)
                                        
                                        
  }
}