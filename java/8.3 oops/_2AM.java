
public class _2AM {
    
    public static void main(String[] args) {
        Animals obj =new Animals();
        obj.run();
        obj.Species = "lion";
        obj.breed ="lionera";
        obj.colour= "palpal";

        System.out.println(obj.colour);

        System.out.println(obj.Species);

        //Animals.run();// for static method
        
    }
}


class Animals{
    String Species;
    String breed;
    String colour;

     public void run(){
        System.out.println("They're running");
    }


    
}