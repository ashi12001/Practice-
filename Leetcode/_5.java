import java.util.Scanner;

public class _5 {
    public static int takingMatrix(int array[][]){
        Scanner sc =new Scanner(System.in);
        //works on intuition
        // A. Beautiful Matrix
        int rowIndex=0;
        int colIndex=0;


        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                array[i][j]=sc.nextInt();
                if(array[i][j]==1){
                    rowIndex =i;
                    colIndex=j;
                }
            }
            System.out.println();    
        }
        sc.close();

        return Math.abs(2-rowIndex)+Math.abs(2-colIndex);

    }
    public static void main(String[] args) {
        int[][] array = new int[5][5];
        System.out.println(takingMatrix(array));

    }
}
