// reverse a string using recursion.


public class _2reversethestring {

    public static void reverse(char arr[], int start ,int end){
        if(start>=end)
        return;

        char temp = arr[start];
        arr [start]= arr[end];
        arr[end]=temp;

        reverse(arr, start+1, end-1);
        
       
        
    }

    public static void main(String[] args) {
        String a = "racecar";
        char chararr []= a.toCharArray();

        int start  = 0;
        int end = chararr.length-1;
        reverse(chararr, start, end);

        for (char c : chararr) {
            System.out.print(c);
        }



      
        
    }
}
