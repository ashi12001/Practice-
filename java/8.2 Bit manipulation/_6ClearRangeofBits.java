public class _6ClearRangeofBits {
    public static void main(String[] args) {
        int  n= 10;
        System.out.println(n);
        int i,j;
        int bitmask=0;
        int ans=0;
        
        j=4;
        for (i=2;i<=j;i++) {
            bitmask =(1<<i);
            
            ans=n&bitmask;

            
            
        }
        System.out.println(ans);



        
    }
}
