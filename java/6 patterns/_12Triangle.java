public class _12Triangle {
    public static void main(String[] args) {
        
       /*  0-1 Triangle pattern
1 
0 1
1 0 1
0 1 0 1
1 0 1 0 1*/
     

      


         for(int i =1; i<=5;i++){

            for(int j =1;j<=i;j++){
                //separate condition for i and j

                if(i%2==0){
                    if(j%2==0){
                        System.out.print("1 ");
                    }
                    else{
                        System.out.print("0 ");
                    }

                }
                else{
                    if(j%2==0){
                        System.out.print("0 ");
                    }
                    else{
                        System.out.print("1 ");
                    }
                }
            }
            System.out.println();
         }
         
















    }
}
