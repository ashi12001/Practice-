public class _6reverse {
    public static void reverseArr(int arr[]){
//25/04/2023
int start =0;
        int end = arr.length-1;

        while(start<end){
            int temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("reversed successfully");

    }

    public static void main(String[] args) {
        
        int numbers []={1,2,34,1,2,3,4,5,6};
        reverseArr(numbers);

        for(int i:numbers){
            System.out.print(i+" ");
        }


    }
}
