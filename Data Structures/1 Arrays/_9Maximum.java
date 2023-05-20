public class _9Maximum {
    //maximum subarray

    public static void maximumSubarray(int arr[]){
        int maximumSum = Integer.MIN_VALUE;
        int currSum =0;
        

        for (int i = 0; i < arr.length; i++) {
            int start =i;
            for (int j = i; j < arr.length; j++) {
                int end =j;
                currSum=0;
                for (int k = start; k <=end; k++) {
                    currSum+=arr[k];
                    
                }
                System.out.println(currSum);
                if(maximumSum<currSum){
                    maximumSum=currSum;
                }
                
            }
            
        }
        System.out.println("maximum sum is "+maximumSum);

    }
    public static void main(String[] args) {
        
        int arr[]={1,-2,6,-1,3};
        maximumSubarray(arr);
    }
}
