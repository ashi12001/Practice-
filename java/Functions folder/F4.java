public class F4 {
    public static int mult(int a,int b){
        return a*b;
    }
    public static int fact(int a){
        int fac=1;
        for(int i =1;i<=a;i++){
            fac=fac*i;

        }
        return fac;

            
        
        
    }
    public static int coeff(int n,int r){
        int a =fact(n);
        int b=fact(r);
        int c =fact(n-r);

        return a/(b*c);

    }
    public static void main(String[] args) {
        //multiply and factorial

        System.out.println(fact(4));
        System.out.println("multiplication of number is "+mult(2,234));
        System.out.println("binomial coefficient is "+ coeff(5,2));
    }
}
