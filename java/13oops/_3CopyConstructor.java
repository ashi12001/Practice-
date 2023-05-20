public class _3CopyConstructor {
                                        
       public static void main(String[] args) {

        Student s1= new Student();
        s1.name ="Ashi";
        s1.rollNo="One Million ";
        Student s2 = new Student(s1);

        System.out.println(s2.name);
        System.out.println(s2.rollNo);
                                        
                                        
                                        
  }
}

class Student{
    String name;
    String rollNo;
    Student(){
        System.out.println("\n\nDefault is called");
    }


    Student(Student s1){
        this.name =s1.name;
        this.rollNo="10";

    }
}