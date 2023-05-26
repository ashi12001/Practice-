// get the largest element of an array using recursion.

public class _1PrintingArray  {
        static int max =Integer.MIN_VALUE;

        public static int name(int arr[], int l) {
            if(l==0){
                return 0;
            }
            
            name(arr, l-1);
            System.out.print(arr[l-1]+" ");
            if(max<arr[l-1]){
                max=arr[l-1];
            }
            return max;
            
        }
                                        
       public static void main(String[] args) {
        int arr []={1,2,67,32,1023423};
        int l = arr.length;
        int maxy =name(arr, l);
        System.out.println();
        System.out.println(maxy);
                                        
                                        
                                        
  }
}