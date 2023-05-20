public class F5 {

    //function overloading by parameter 

    public static int sum(int a,int b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }
    public static int sum(int a,int b,int c,int d){
        return a+b+c+d;
    }

    public static void main(String[] args) {
        System.out.println(sum(1, 2, 5, 2));
        System.out.println(sum(2, 1, 5));
        System.out.println(sum(2,32));

    }


    
}
