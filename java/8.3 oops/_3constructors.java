public class _3constructors {
                                        
       public static void main(String[] args) {

        Mantis obj = new Mantis("pamela");
        
        obj.color="pink";
        System.out.println(obj.color);

                                        
                                        
                                        
  }
}

/**
 * Inner_3constructors
 */
class Mantis {
    int size;
    String color;
    String naam;

    Mantis(){
        System.out.println("hello mantis wtf is happening constructor called automatically");
    }

    Mantis(String name){
        this.naam = name;
        System.out.println("mantis name is "+ naam);
    }


    
}
