public class F9 {
    public static void main(String[] args) {
        int bin =1001;
        int pow=0;
        int ans =0;

        while(bin>0){
            int lastDigit = bin%10;
            ans =ans + lastDigit*(int)Math.pow(2,pow);
            bin=bin/10;pow++;

        }
        System.out.println(ans);

        int dec =ans;
        ans =0;
        int rv =0;

        while(dec>0){
            ans = dec%2;
            dec=dec/2;
            rv =rv*10 +ans;


        }
        System.out.println(rv);

    }
}
