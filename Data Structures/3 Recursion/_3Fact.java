public class _3Fact {
       public static int findFact(int n){
            if(n>0){
                 return n*findFact(n-1);
            }
            return 1;

       }
                                        
       public static void main(String[] args) {

        System.out.println(findFact(5));
                                        
                                        
                                        
  }
}