public class _5PrintArr {
    public static void printArr(int arr [],int l){
        if(l>0){
            
            printArr(arr, l-1);
            System.out.println(arr[l-1]);

        }
       
    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8};
        printArr(arr, 8);
    }
    
}

/* print the array element using recursion */