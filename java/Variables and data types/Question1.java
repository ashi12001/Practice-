import java.util.Scanner;

public class Question1 {
                                        
       public static void main(String[] args) {

        Scanner sc =new Scanner(System.in);
        int a= sc.nextInt();
        int b= sc.nextInt();
        int c= sc.nextInt();
        int average = (a+b+c)/3;
        System.out.println("average is "+ average);
         

        System.out.println("Enter side of square ");
        int side = sc.nextInt();
        System.out.println(side*side);

       /* Enter costof 3itemsfrom the user(usingfloatdatatype)-apencil,apenandan eraser. 
        You have to output the total cost of the items back to the user as their bill
        .(Add on : You can also try adding 18% gst tax to the items in the bill as an advanced problem)      */ 
        System.out.println("enter cost of 3 items");
        float item1 = sc.nextFloat();
        float item2 = sc.nextFloat();
        float item3 = sc.nextFloat();
        float bill = item1+ item2+item3;
        bill += bill*(18/100);
        System.out.println("bill is "+bill);

        int $ =12;
        System.out.println($);
        sc.close();


                                        
  }
}