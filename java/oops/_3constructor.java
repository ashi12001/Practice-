public class _3constructor {
    public static void main(String[] args) {
        Student s1= new Student(10);
        System.out.println(s1.rollNo);
    }
    
}
class Student{
    int rollNo;
    Student(){

        System.out.println("\n Hello constructor has been  called");
    }
    Student(String A){
        System.out.println(A+ " constuctor has been called ");

    }
    Student(int roll){
        this.rollNo=roll;
    }
}
