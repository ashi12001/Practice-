public class _8Hollow {
    public static void main(String[] args) {
        

        //I have to make a hollow rectangle  where you can Enter sides but let's try with square first

        int side =5;

        for(int i =1;i<=side;i++){
            //Logic is Easy just break your problem down into smaller part
            
            if(i==5||i==1){
                for(int j=1;j<=side;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for (int k = 1; k<=side-2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
