public class x {
    public static void main(String[] args) {
        int a []= {4,5,6,7,0,1,2};
        int target =6;

        int start =0;
        int end  = a.length -1;


        while(start<=end){
            int mid = start +(end-start)/2;
            if(a[mid]==target){
                System.out.println("found");
                break;
            }
            else if(a[mid]<target){
                end =mid-1;
            }
            else{
                start =mid+1;
            }
        }
        System.out.println("exit");


    }
}
