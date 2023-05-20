import java.util.Scanner;

public class  _1 {
                                        
       public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k =sc.nextInt();

        int timeLeft =240-k;

        int arr[]=new int[n];

        for (int i = 1; i <=arr.length; i++) {
            arr[i-1]=i*5;
            
        }
       
        int sum =0;
        int ans=0;


        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
            if(sum>timeLeft){
                ans=i;
                break;
                
            }
            else{
                ans=arr.length;
            }

        }
        System.out.println(ans);
        sc.close();



                                        
                                        
                                        
  }
}