public class _Q3 {
    // Write a program to FindTranspose ofa Matrix.
    public static void main(String[] args) {
        int[][] nums = { {1,2,3},{4,5,6}};

        int [][]nu=new int [nums[0].length][nums.length];

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[0].length; j++) {
                nu[j][i]=nums[i][j];
                
                
            }
            
        }
        for (int i = 0; i < nu.length; i++) {
            for (int j = 0; j < nu[0].length; j++) {
                System.out.print(nu[i][j]+" ");
                
            }
            System.out.println();
        }
        
    }
}
