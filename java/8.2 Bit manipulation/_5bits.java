public class _5bits {
    public static void main(String[] args) {
        int n = (-1)<<2;
        System.out.println(n);
//clearing last i bits using negation of zero and and operation
        int a=15;
        int i=2;
        int bitMask =(~0)<<i;

        System.out.println(a&bitMask);

        int num = 0b1111;
        System.out.println(num);



    }
}
