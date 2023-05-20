public class _4Inheritance {
                                        
       public static void main(String[] args) {
        fish f = new fish();
        f.eat();
        f.sleeping();
        
                                        
                                        
                                        
  }
}



class Animals{
    int age;
    int colour;
    void eat(){
        System.out.println(" Eating");
    }
    
    void sleeping(){
        System.out.println(" sleeping");
    }

}

class fish extends Animals{
    void canSwim(){
        System.out.println("can swim ");
    }
}