public class _3insertionsort {
    public static void main(String[] args) {
        int arr[]={5,4,3,11111,22,33,2,1,6};

        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j <i+1; j++) {
                int temp = arr[i+1-j];
                if(temp>arr[i-j]){
                    //push back
                    
                }
                else{
                    arr[i+1-j]=arr[i-j];
                    arr[i-j]=temp;
                }
                
            }
            
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }

    }
}
