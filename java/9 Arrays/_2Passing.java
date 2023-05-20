public class _2Passing {
//Here i have learned when the array is passed in function it passed as a ref


    public static void update(int arr[],int nonChangeable){
        for (int i = 0; i < arr.length; i++) {
            arr[i]+=1;
            
        }
        nonChangeable=100;
        System.out.println(nonChangeable);

    }
    public static void main(String[] args) {
        int numbers[]={12,332,3,44,3,23,1,1};
        int numb =10;


        update(numbers,numb);

        for(int num: numbers){
            System.out.print(num+" ");
        }
        System.out.println();

        
        System.out.println(numb);
    }
}
