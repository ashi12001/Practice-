public class _2Darrays  {
                                        
       public static void main(String[] args) {

        String [][]Cars =new String[3][3];

        Cars[0][0]= "Audi R8";
        Cars[0][1]= "Mercedes Benz AMG GT";
        Cars[0][2]= "Ferrari 488";

        Cars[1][0]= "Mercedes Huracan";
        Cars[1][1]= "Nissan GTR";
        Cars[1][2]= "Ferrari 812";

        Cars[2][0]= "lambhorgini Aventador";
        Cars[2][1]= "Aston MArtin DB 11";
        Cars[2][2]= "BEntley Continental GT";


        for(int i =0; i<Cars.length;i++){

            for(int j=0; j< Cars[i].length;j++){

                System.out.print(Cars[i][j]+" ");

            }

            System.out.println();

        }
                                        
                                        
                                        
  }
}