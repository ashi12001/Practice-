public class F3 {
    //java works on call by value
    public static void changeA(int A){
        A=10;
        
    }


    public static void main(String[] args) {

        int a=2;
        changeA(a);
        System.out.println(a);
        
    }
}
