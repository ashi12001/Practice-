public class _5MethodOverloadingAndOverriding {
    public static void main(String[] args) {
        ReturnNum obj =new ReturnNum();
        obj.Add(2.5);
        
        Square obj1 =new Square();
        obj1.Add(2.2);
        
        
    }
}

class ReturnNum{
    int Add(int a){
        return a+2;

    }
    void Add(double a){
        System.out.println(a+1.5);
    }
    int Add(long a){
        return (int)a+22;
    }
}

class Square extends ReturnNum{
    void Add(double a ){
        System.out.println(a*10);

    }

}
