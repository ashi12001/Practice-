public class _4LinearLargest {
    public static int large(int arr[]){
        int  largest =Integer.MIN_VALUE;
        int  smallest =Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
           
           if(largest<arr[i]){
            largest=arr[i];
           }
           if(smallest>arr[i]){
            smallest=arr[i];
           }
        }
        return smallest;
    }


    public static void main(String[] args) {
        int numbers []={8,2,23234,45,10000,999999,10,4};


        System.out.println(large(numbers));
    }
}
