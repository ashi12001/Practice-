public class _9HRectangle {
    public static void main(String[] args) {
        

        //I have to make a hollow rectangle  where you can Enter sides but let's try with square first

        int Breadth =10;
        int length =5;

        for(int i =1;i<=length;i++){
            //Logic is Easy just break your problem down into smaller part
            
            if(i==5||i==1){
                for(int j=1;j<=Breadth;j++){
                    System.out.print("*");
                }
            }
            else{
                System.out.print("*");
                for (int k = 1; k<=Breadth-2; k++) {
                    System.out.print(" ");
                }
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
