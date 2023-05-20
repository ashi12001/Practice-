import java.util.Scanner;

public class _6 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt();        
        int t =sc.nextInt(); 
              
        String  s =sc.nextLine();
        StringBuilder obj = new StringBuilder(s); 
        
        for (int i = 0; i < t; i++) { // outer loop checks the ele
            for (int j = 0; j < n; j++) {
                if(s.charAt(j)=='B'&&s.charAt(j)=='G'){
                    char temp = s.charAt(j);
                    s.charAt(i)
                    
                }
                
            }
            
        }
    }
}


/*  266b B. Queue at the School

he first line contains two integers n and t (1 ≤ n, t ≤ 50), which represent 
the number of children in the queue and the time after which the queue will
 transform into the arrangement you need to find.

The next line contains string s, which represents the 
schoolchildren's initial arrangement. If the i-th position in
 the queue contains a boy, then the i-th character of string s equals "B",
  otherwise the i-th character equals "G"
 */