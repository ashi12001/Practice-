public class _1gettersAndSetters {

    public static void main(String[] args) {
        pen p1 = new pen();
        p1.setColour("blue");
        System.out.println(p1.getcolour());
        
        p1.setTip(5);
        System.out.println(p1.getTip());
    }
}

class pen {
    private int tip; // in mm
    private String color;

    void setColour(String color){
       this.color=color;
    }
    String getcolour(){
        return this.color;
    }
    
    void setTip(int tip){
        this.tip=tip;
     }
     int getTip(){
         return this.tip;
     }

  
  
    

}