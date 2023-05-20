public class _8Subarray {
    public static void  subArray(int arr[]){

        //25/04/2023
        
        int tp=0;
        int sum=0;
        int maximum=0;
        int tk=0;
        for(int i =0;i<arr.length;i++){
            int start=i;
            
                maximum = Integer.MIN_VALUE;
                
            
            for(int j=i;j<arr.length;j++){ //j ki value i se because  end  2 se start hoga
                int end =j;
                sum =0;
                for(int k =start;k<=end;k++){
                    System.out.print(arr[k]+" ");
                    sum = sum + arr[k];
                }
                if(maximum<sum){
                    maximum=sum;
                }
          
                // System.out.print("sum of this sub array is "+ sum);
                tp++;
                System.out.println(); //endline after printing one subarray 
            }
            
            System.out.println();
           
            if(maximum<tk){

                maximum=tk;
            }
            tk =maximum;
        }
        System.out.println("TOtal sub arrays are "+tp);
        System.out.println("maximum value of subarray is "+maximum);
    }

    public static void main(String[] args) {
        int arr []={2,4,6,8,10};
        subArray(arr);
    }
}
