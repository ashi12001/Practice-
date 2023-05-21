public class _8converIntoString {
    static int m ;
    public static void convert(int n){
        if(n>0){
            convert(n/10);
            m = n%10;
            
            System.out.print(returnString(m)+" ");
        }
    }



    public static String returnString(int number){
        if(number==1){
            return "one";
        }
        if(number==2){
            return "two";
        }
        if(number==3){
            return "three";
        }
        if(number==4){
            return "four";
        }
        if(number==5){
            return "five";
        }
        if(number==6){
            return "six";
        }
        if(number==7){
            return "seven";
        }
        if(number==8){
            return "eight";
        }
        if(number==9){
            return "nine";
        }
        return "zero";

    }
    
    public static void main(String[] args) {
        convert(1948);
    }
}


// Sample Input: 1947 Sample Output: “one nine four seven”
// Convert a no. to string using recursion

// I did this too by intuition    
// Basically i made a base condition and used head recursion