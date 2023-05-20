public class _7pairsArray {
//25/04/2023

    public static void pairs(int arr[]){
        int totalPairs=0;

        for(int i =0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i]+","+arr[j]+")"+" " );
                totalPairs+=1;
            }
            System.out.println();
        }
        System.out.println("total pairs is "+totalPairs);

    }

    public static void main(String[] args) {
        int evenNumbers[]={2,4,6,8,10};

        pairs(evenNumbers);

    }
    
}
