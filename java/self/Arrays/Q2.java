import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        
// Take 10 integer inputs from user and store them in an array.
//  Again ask user to give a number. Now, tell user whether that number is present in array or not.         


Scanner sc = new Scanner(System.in);

int[] age =new int[10];

for(int i=0;i<10;i++){
    age[i]= sc.nextInt();
}
System.out.println("Enter any number");
int a = sc.nextInt();
Boolean A=true;

for (int i=0;i<10;i++){
    if(age[i]==a){
        A= false;
        break;
        
    }
    else{
        
    }
}
sc.close();

if (!A) {
    System.out.println("present in array");
    
}
else{
    System.out.println("not there");
}

    }
}
