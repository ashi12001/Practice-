public class _2SelectionSort {

    public static void SelectionSor(int a[]){
        

        for (int i = 0; i < a.length-1; i++) {
           
            int minpos=0;
            int minn =Integer.MAX_VALUE;

            for (int j = i+1; j < a.length; j++) {
                if(minn>a[j]){
                    minn=a[j];
                    minpos=j;

                }

            }
            System.out.println();

            int temp = a[minpos];
            a[minpos]=a[i];
            a[i]=temp;
            
            
        }
    }
    public static void main(String[] args) {
        int numbers []={5,4,1,3,2};
        //descending selection sort

        SelectionSor(numbers);

        for (int i : numbers) {
            System.out.print(i+" ");
        }

    }
}
