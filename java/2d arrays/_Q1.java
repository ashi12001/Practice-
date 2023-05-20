public class _Q1 {
    // Print the number of 7’s that are inthe 2d array.
    // Example :
    // Input - int[][] array = { {4,7,8},{8,8,7} }


    public static void main(String[] args) {
        int[][] arrayy = { {4,7,8},{8,8,7} };
        int num =0;

        for(int  i =0; i<arrayy.length;i++){
            for (int j = 0; j < arrayy[0].length; j++) {

                if(arrayy[i][j]==8){
                    num++;
                }
                
            }
        }
        System.out.println(num);
    }
}
