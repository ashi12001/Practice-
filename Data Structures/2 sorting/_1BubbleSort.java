public class _1BubbleSort {

    public static void bubbleSort(int arr[]){

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int temp =arr[j+1];   //smaller gaya temp me
                    arr[j+1]=arr[j];       // aage shift hua bada
                    arr[j]=temp;

                }
            
            
        }
        
        }
        System.out.println("sorted");
    }
    public static void main(String[] args) {

        int numbers []={5,4,1,3,2};

        // bubbleSort(numbers);

        for (int i : numbers) {
            System.out.print(i+ " ");
            
        }
        
    }
}
