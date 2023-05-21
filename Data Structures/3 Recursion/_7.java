public class _7  {
       public static void printOcc(int arr[], int key,int l){
        if(l>0){
            printOcc(arr, key, l-1);
            if(arr[l]==key)
            System.out.println(l);
        }

       }                                        
       public static void main(String[] args) {
       int  arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2}, key = 2;
       int l = arr.length-1;
       printOcc(arr, key, l);
             
                                        
                                        
  }
}

// Find all the occurence of n in array using recursion
// Sample Input: arr[ ] = {3, 2, 4, 5, 6, 2, 7, 2, 2},key = 2Sample Output: 1 5 7 8

// i just used head recursion here then printed all the occurence at returning time