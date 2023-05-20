public record _10Q2() {
    public static void main(String[] args) {
       int n =5;
       
       for (int i = 1; i <= n; i++) {
            int m =0; 
        for(int j =1;j<=n-i+1;j++){
            
            m++;
            System.out.print(m);
        }
        System.out.println();
        
       }
    }
}
