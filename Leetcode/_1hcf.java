/* 
492. Construct the Rectangle

A web developer needs to know how to design a web page's size. So, given a specific rectangular web page’s area, your job by now is to design a rectangular web page, whose length L and width W satisfy the following requirements:

The area of the rectangular web page you designed must equal to the given target area.
The width W should not be larger than the length L, which means L >= W.
The difference between length L and width W should be as small as possible.
Return an array [L, W] where L and W are the length and width of the web page you designed in sequence.

* first approach bruteforce method  
* recursion  
*/









public class _1hcf  {

    public static void printhcf(int n){
        int min = Integer.MAX_VALUE;
        int first=0 ;
        int second=0;
        
        for (int i = n; i > 1; i--) {
           
            for (int j = n; j > 1; j--) {
                if(i>=j&&i*j==n){
                    int curr = i-j;

                    if(min>curr){
                        curr=min;
                        first =i;
                        second =j;
                    }

                }
                    
                }
                
            }
            
        System.out.println(first +" "+ second);
       
    }
    
       
                                        
    public static void main(String[] args) {
        System.out.println("hello");
        printhcf(24);

       
                
                                        
                                        
  }
}