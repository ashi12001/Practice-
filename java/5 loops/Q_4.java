public class Q_4 {
    public static void main(String[] args) {
        int number = 64;


        for (int i = 2; i < number; i++) {
            if (number%i==0) {
                System.out.println("Not prime");
                return; 
            }
            
        }
        System.out.println("prime");


    }
    
}
