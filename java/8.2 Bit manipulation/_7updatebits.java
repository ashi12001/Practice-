public class _7updatebits {
    public static void update(int n , int i, int up){
        if(up==0){
            int bitmask =~(1<<i);
            System.out.println(n&bitmask);
        }
        if(up==1){
            int bitmask = (1<<i);
            System.out.println(n|bitmask);
        }
    }
    public static void main(String[] args) {
        update(5, 0, 0);    //101
    }
}
