public class _1classesAndObjects {
                                        
       public static void main(String[] args) {

        pen pen1 = new pen();
        pen1.setColour("blue");
        System.out.println(pen1.color);

        student s1 = new student();

        s1.name ="anmol";
        s1.age="10";
        int A= s1.CalculatePercentage(100,0, 0);
        System.out.println(A);
        System.out.println(s1.percentage);// getting percentage
                                        
                                        
                                        
  }
}
class pen{
  int tip; //in mm
  String color;
  void setColour(String s){{
     color=s;
  }


  }

}
class student{
  String name;
  String age;
  float percentage;

  int CalculatePercentage(int subA,int subB,int subC){
    percentage =(subA+subB+subC)/3;
    return (subA+subB+subC)/3;
  }
}