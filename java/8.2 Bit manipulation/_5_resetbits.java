public class _5_resetbits {
    public static void main(String[] args) {
        int bitmask = ~(1<<0);
        
        int result = 5 & bitmask;
        System.out.println(result);
    }
}
