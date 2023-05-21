public class _6CountDIgits {
    static int count =0;

    public static int countDigits(int n){
        if(n>0)
        {
            count++;
            return countDigits(n/10);
        }
        return count;
        
    }
    public static void main(String[] args) {
        System.out.println(countDigits(5034244));
    }
}

// count no of digits in a number

//solved by intuition  i just divided  it by 10 and made a count var to count how many times it can be divided by 10