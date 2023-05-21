public class _2Sumofn {
    public static int sumOfN(int n){
        if(n>0)
        return n+sumOfN(n-1);
        return 0;
    }
    public static void main(String[] args) {
        int sumOfNumbers = sumOfN(5);
        System.out.println(sumOfNumbers);
    }
}
