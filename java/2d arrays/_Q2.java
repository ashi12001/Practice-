public class _Q2 {
    public static void main(String[] args) {
        // Question 2 : Print out the sum of the numbers inthe second row of the “nums” array
        // Input - int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };

        int[][] nums = { {1,4,9},{11,4,3},{2,2,3} };
        int sum =0;
        for (int i = 0; i < nums[0].length; i++) {
            sum+=nums[1][i];
            
        }
        System.out.println(sum);
    }
}
