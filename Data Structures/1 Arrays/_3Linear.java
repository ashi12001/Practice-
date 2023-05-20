public class _3Linear {
    public static int findKey(int arr[],int key){
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key){
                return 0;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers []= {20,23040,121,100};

        int index =findKey(numbers,100);

        if(index==-1){
            System.out.println("not found");
        }
        else{
            System.out.println("found");
        }
    }
}
