public class _5binary {
                                        
    public static int findKey(int arr[],int key){
        int start=0; 
        int end =arr.length -1;

        while(start<=end){
            int mid = (start+end)/2;

            if(arr[mid]==key){
                return mid;
            }
            if(arr[mid]>=key){
                end = mid-1;
            }
            else{
                start =mid+1;
            }
        }
        return -1;
    }

    public static int findKeyy(int arr[],int x){
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int m = l + (r - l) / 2;
 
            // Check if x is present at mid
            if (arr[m] == x)
                return m;
 
            // If x greater, ignore left half
            if (arr[m] < x)
                l = m + 1;
 
            // If x is smaller, ignore right half
            else
                r = m - 1;
        }
 
        // if we reach here, then element was
        // not present
        return -1;
    }
    public static void main(String[] args) {
                
        int primeNumbers []={4,5,6,7,0,1,2};
        System.out.println(findKeyy(primeNumbers, 2));
                                        
                                        
  }
}