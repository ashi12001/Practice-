public class _3max {
    public static void main(String[] args) {
        System.out.println("MAximum of 3 numbers");

        int a =10;
        int b =123;
        int c =7977;


        if(a>b){
            if(a>c){
                System.out.println("bigges is "+ a);
            }
            else{
                System.out.println("bigges is "+ c);
               
            }
        }
        else{
            if(b>c){
                System.out.println("bigges is "+ b);
            }
            else{
                System.out.println("bigges is "+ c);
            }
        }
    }
    
}
